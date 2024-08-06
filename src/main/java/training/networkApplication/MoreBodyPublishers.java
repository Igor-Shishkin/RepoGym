package training.networkApplication;

import java.io.IOException;
import java.net.URLEncoder;
import java.net.http.HttpRequest.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Cay Horstmann
 */
public class MoreBodyPublishers {
    public static BodyPublisher ofFormData(Map<Object, Object> data) {
        var first = true;
        var builder = new StringBuilder();
        for (var entry : data.entrySet()) {
            if (first) {first = false;}
            else builder.append('&');
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append('=');
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        return BodyPublishers.ofString(builder.toString());
    }

    public static byte[] bytes(String s) {return s.getBytes(StandardCharsets.UTF_8);}

    public static BodyPublisher ofMimeMultipartData(Map<Object, Object> data, String boundary) throws IOException {
        var byteArrays = new ArrayList<byte[]>();
        byte[] separator = bytes("--" + boundary + "\nContent-Disposition: form-data; name=");
        for (var entry : data.entrySet()) {
            byteArrays.add(separator);
            if (entry.getValue() instanceof Path) {
                var path = (Path) entry.getValue();
                String mimeType = Files.probeContentType(path);
                byteArrays.add(bytes("\"" + entry.getKey() + "\"=\"" + mimeType + "\"; fileName=\"" +
                        path.getFileName() + "\"" + "\"\ncContentType: " + mimeType + "\n\n"));
                byteArrays.add(Files.readAllBytes(path));
            } else {
                byteArrays.add(bytes("\"" + entry.getKey() + "\"\n\n" + entry.getValue() + "\n"));
            }
        }
        byteArrays.add(bytes("--" + boundary + "--"));
        return BodyPublishers.ofByteArrays(byteArrays);
    }

    public static BodyPublisher ofSimpleJson(Map<Object, Object> data) {
        var builder = new StringBuilder();
        builder.append("{");
        var first = true;
        for (var entry : data.entrySet()) {
            if (first) {first = false;}
            else builder.append('&');

            builder.append(jsonEscape(entry.getKey().toString()))
                    .append(": ")
                    .append(jsonEscape(entry.getValue().toString()));
        }
        builder.append("}");
        return BodyPublishers.ofString(builder.toString());
    }

    public static StringBuilder jsonEscape(String s) {
        var result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String replacement = replacements.get(ch);
            if (replacement == null) { result.append(ch); }
            else { result.append(replacement); }
        }
        result.append('"');
        return result;
    }

    private static final Map<Character, String> replacements = Map.of('\b', "\\b", '\f', "\\f", '\n', "\\n",
            '\r', "\\r", '\t', "\\t", '"', "\\", '\\', "\\\\");
}













