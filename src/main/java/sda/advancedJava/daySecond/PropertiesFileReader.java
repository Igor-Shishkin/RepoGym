package sda.advancedJava.daySecond;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String sep = File.separator;
        FileInputStream fis = new FileInputStream("src".concat(sep).concat("main")
                .concat(sep).concat("resources").concat(sep).concat("jdbc.properties"));

        properties.load(fis);
        String userName = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driver = properties.getProperty("jdbc.driver");

        System.out.println("Login: ".concat(userName));
        System.out.println("Password: ".concat(password));
        System.out.println("Driver: ".concat(driver));
        System.out.println("Locale: ".concat(properties.getProperty("jdbc.locale", "pl")));
    }
}
