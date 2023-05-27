package recapPracticalProject;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/java26";
        String username = "root";
        String password = "root";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            System.out.println("Connected to database!");

            while (again == 'y') {
                System.out.println("Choose one option (r,i,d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");

                char action = scanner.nextLine().charAt(0);

                if (action == 'i') {

                    System.out.println("Enter username");
                    String newUsername = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter email");
                    String newEmail = scanner.nextLine();

                    insertData(conn, newUsername, newPassword, newFullName, newEmail);

                } else if (action == 'r') {
                    readData(conn);
                } else if (action == 'd') {
                    System.out.println("Enter username you want to delete");
                    String deleteUser = scanner.nextLine();
                    deleteData(conn,deleteUser);
                } else {
                    System.out.println("Invalid input!");
                }
                System.out.println("Do you want to do something more? y/n");
                again = scanner.nextLine().charAt(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readData(Connection conn) throws SQLException {
        String sql = "SELECT * FROM users";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;

        while (resultSet.next()) {
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            String output = "User #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, username, password, fullName, email));
        }
    }

    private static void insertData(Connection conn, String newUsername, String newPassword,
                                  String newFullName, String newEmail) throws SQLException {
        String sql = "INSERT INTO users(username, password, fullName, email) VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, newUsername);
        preparedStatement.setString(2, newPassword);
        preparedStatement.setString(3, newFullName);
        preparedStatement.setString(4, newEmail);
        int rowInserted = preparedStatement.executeUpdate();

        if(rowInserted >0){
            System.out.println("A new users was inserted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }

    private static void deleteData(Connection conn, String deleteUser) throws SQLException {
        String sql = "DELETE FROM users WHERE username = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, deleteUser);

        boolean deleted = ps.execute();
        if (deleted){
            System.out.println("Something went wrong");
        } else {
            System.out.println("User deleted");
        }
    }
}
