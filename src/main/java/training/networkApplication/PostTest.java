package training.networkApplication;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Cay Horstmann
 */
public class PostTest {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String propsFilename = args.length > 0 ? args[0] : "src/main/java/training/networkApplication/post/post.properties";
        var props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get(propsFilename))) {
            props.load(in);
        }
        String urlString = props.remove("url").toString();
        Object userAgent = props.remove("User-Agent");
        Object redirects = props.remove("redirects");
        CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
        String result = doPost(new URI(urlString).toURL(), props,
                userAgent == null ? null : userAgent.toString(),
                redirects == null ? null : Integer.parseInt(redirects.toString()));
        System.out.println(formatJson(result));
    }



    private static String doPost(URL url, Map<Object, Object> nameValuePairs, String userAgent, Integer redirect)
            throws IOException {
        var connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        if (userAgent != null) {
            connection.setRequestProperty("User-Agent", userAgent);
        }
        if (redirect >= 0) {
            connection.setInstanceFollowRedirects(false);
        }
        connection.setDoOutput(true);

        try (var out = new PrintWriter(connection.getOutputStream())) {
            var first = true;
            for (var pair : nameValuePairs.entrySet()) {
                if (first) first = false;
                else out.print("&");
                String name = pair.getKey().toString();
                String value = pair.getValue().toString();
                out.print(name);
                out.print('=');
                out.print(URLEncoder.encode(value, StandardCharsets.UTF_8));
            }
        }
        String encoding = connection.getContentEncoding();
        if (encoding == null) {
            encoding = "UTF-8";
        }

        if (redirect > 0) {
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_MOVED_TEMP ||
                    responseCode == HttpURLConnection.HTTP_MOVED_PERM ||
                    responseCode == HttpURLConnection.HTTP_SEE_OTHER) {
                String location = connection.getHeaderField("Location");
                if (location != null) {
                    URL base = connection.getURL();
                    connection.disconnect();
                    return doPost(new URL(base, location), nameValuePairs, userAgent, redirect - 1);
                }
            }
        } else if (redirect == 0) {
            throw new IOException("to much redirects");
        }

        System.out.println("\n" +  connection.getRequestMethod() + "\n");
        System.out.println("\n" +  connection.getResponseCode() + "\n");
        System.out.println("\n" +  connection.getIfModifiedSince() + "\n");

        var response = new StringBuilder();
        try (var in = new Scanner(connection.getInputStream(), encoding)) {
            while (in.hasNextLine()) {
                response.append(in.nextLine());
                response.append('\n');
            }
        } catch (IOException e) {
            InputStream err = connection.getErrorStream();
            if (err == null) {
                throw e;
            }
            try (var in = new Scanner(err, encoding)) {
                while (in.hasNextLine()) {
                    response.append(in.nextLine());
                    response.append('\n');
                }
            }
        }
        return response.toString();
    }
    private static String formatJson(String jsonString) {
        try {
            Object json = new JSONObject(jsonString);
            return ((JSONObject) json).toString(4); // Indent with 4 spaces
        } catch (Exception e) {
            try {
                Object json = new JSONArray(jsonString);
                return ((JSONArray) json).toString(4); // Indent with 4 spaces
            } catch (Exception ex) {
                return jsonString; // If it's not JSON, return the original string
            }
        }
    }
}
