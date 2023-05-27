package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?serverTimezone=UTC", "root", "root");

            PreparedStatement ps = conn.prepareStatement("UPDATE school.students " +
                    "SET first_name = ? WHERE id = ? ");
            ps.setString(1,"Juhan");
            ps.setInt(2,1);
            int updatedRows = ps.executeUpdate();
            System.out.println(updatedRows);
            //ps.setInt(2, 1);
//            ResultSet rs = ps.executeQuery();

//            List<User> users = new ArrayList<>();
//
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String fName = rs.getString("first_name");
//                String lName = rs.getString("last_name");
//                User user = new User();
//                user.setId(id);
//                user.setFirstName(fName);
//                user.setLastName(lName);
//                users.add(user);
//
//            }
//            System.out.println(users);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
