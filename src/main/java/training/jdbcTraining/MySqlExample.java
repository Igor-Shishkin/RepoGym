package training.jdbcTraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/marton_db";
        String username = "root";
        String password = "00000000A!";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the MySQL server database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
