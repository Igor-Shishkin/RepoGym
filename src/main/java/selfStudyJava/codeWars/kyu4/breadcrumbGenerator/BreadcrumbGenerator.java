package selfStudyJava.codeWars.kyu4.breadcrumbGenerator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class BreadcrumbGenerator {
    public static void main(String[] args) {
        String url = "www.microsoft.com/docs/index.htm";
        String separator = " : ";
        if (url.lastIndexOf("/index.") == url.lastIndexOf("/")) {
            url = url.substring(0,url.lastIndexOf("/"));
        }
        String[] PartsUrl = url.split("/");

        String result = null;
        if (PartsUrl.length==2) {
            String active =
            result = String.format("<a href=\"/\">HOME</a>%s<span class=\"active\">%s</span>",
                 separator, PartsUrl[1].toUpperCase());
        }

        String t1 = "123";

        System.out.println(Arrays.toString(PartsUrl));
        System.out.println(result);


    }

//    public static String generate_bc(String url, String separator) {
//        String[] partsUrl = url.split("/");
//
//
//        return String.format("<a href=\"/\">HOME</a> %s <a href=\"/%s",
//                separator, );
//    }


    public static String moreThan30symbols (String text) {
        if (text.length() <= 30) {
            return text;
        } else {
            String[] words = text.split("-");
            String ignoreWords = "[()]"
            Pattern pattern = Pattern.compile()
            for ()
            return ;
        }

    }
}
