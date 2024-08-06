package training.jdbcTraining;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class TestDB {
    public static void main(String[] args) throws IOException {
        try {
            runTest();
        } catch (SQLException e ) {
            e.printStackTrace();
        }
    }

    private static void runTest() throws SQLException, IOException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS mydatabase");
            statement.executeUpdate("USE mydatabase");
            statement.executeUpdate("CREATE TABLE Greetings (Message CHAR(20))");
            statement.executeUpdate("INSERT INTO Greetings VALUES ('Hello world')");
            statement.executeUpdate("INSERT INTO Greetings VALUES ('Hello :)')");
            statement.executeUpdate("INSERT INTO Greetings VALUES ('BY !')");

            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM Greetings")) {

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("Message"));
                    System.out.println(resultSet.getString(1));
                }

                System.out.println();
                if (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            }
            statement.executeUpdate("DROP TABLE Greetings");
        }
    }

    private static Connection getConnection() throws IOException, SQLException {
        var props = new Properties();
        try (InputStream in = Files.newInputStream(
                Paths.get("src/main/java/training/jdbcTraining/database.properties"))) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.getProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, username, password);
    }
}
