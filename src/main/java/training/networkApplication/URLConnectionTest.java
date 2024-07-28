package training.networkApplication;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 * @author Cay Horstmann
 */
public class URLConnectionTest {
    public static void main(String[] args) {
        try {
            String urlName = args.length > 0 ? args[0] : "http://horstmann.com";
            var uri = new URI(urlName);
            var url = uri.toURL();

            URLConnection connection = url.openConnection();

            if (args.length>2) {
                String userName = args[1];
                String password = args[2];
                String input = userName + ":" + password;
                Base64.Encoder encoder = Base64.getEncoder();
                String encoding = encoder.encodeToString(input.getBytes(StandardCharsets.UTF_8));
                connection.setRequestProperty("Authorization", "Basic " + encoding);
            }

            connection.connect();

            Map<String, List<String>> headerFields = connection.getHeaderFields();

            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                for (String value : entry.getValue()) {
                    System.out.println(key + ": " + value);
                }
            }

            System.out.println("\n-----------\n");
            System.out.println("getContentType: " + connection.getContentType());
            System.out.println("getContentLength: " + connection.getContentLength());
            System.out.println("getContentEncoding: " + connection.getContentEncoding());
            System.out.println("getDate: " + connection.getDate());
            System.out.println("getExpiration: " + connection.getExpiration());
            System.out.println("getLastModified: " + connection.getLastModified());

            System.out.println("\n-----------\n");

            String encoding = connection.getContentEncoding();
            if (encoding == null) { encoding = "UTF-8"; }

            try (var in = new Scanner(connection.getInputStream(), encoding)) {
                for (int i = 0; i < 10 && in.hasNextLine(); i++) {
                    System.out.println(in.nextLine());
                }
                if (in.hasNextLine()) {
                    System.out.println("...");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
