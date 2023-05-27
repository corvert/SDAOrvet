package jdbc.lecture02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public Connection createConnection() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cat_club?serverTimezone=UTC", "root", "root");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
