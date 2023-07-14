package selfStudyJava.codeWars.kyu4.breadcrumbGenerator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class BreadcrumbGenerator {
    public static void main(String[] args) {
        String url = "www.microsoft";
        String separator = " * ";
        System.out.println("<<[span class=\"active\">HOME]</span>>");
        if (url.lastIndexOf("/")==url.length()-1) {
            url = url.substring(0,url.lastIndexOf("/"));
        }
        if (url.contains("index.")) {
            url = url.substring(0,url.lastIndexOf("/"));
        }
        if (url.contains("//")) {
            url = url.substring(url.indexOf("/")+2);
        }
//        int length;
        System.out.println(url);
//        String[] devided = url.split("/");
//        if (devided[devided.length - 1] == "") {
//            length = devided.length-1;
//        } else {
//            length = devided.length-2;
//        }
        String[] partsUrl = url.split("/");

        for (int i = 0; i < partsUrl.length; i++) {
            if (partsUrl[i].contains("?")){
                partsUrl[i] = partsUrl[i].substring(0,partsUrl[i].indexOf("?"));
            }
            if (partsUrl[i].contains("#")){
                partsUrl[i] = partsUrl[i].substring(0,partsUrl[i].indexOf("#"));
            }
            if (partsUrl[i].contains(".")){
                partsUrl[i] = partsUrl[i].substring(0,partsUrl[i].indexOf("."));
            }
        }

        int length = (partsUrl[partsUrl.length-1].equalsIgnoreCase("")) ? partsUrl.length-1 : partsUrl.length;

        StringBuilder result = new StringBuilder();
        result.append("<a href=\"/\">HOME</a>");

        for (int i = 1; i < length-1; i++) {
            result.append(separator);
            result.append("<a href=\"/");
            result.append(partsUrl[i]);
            result.append("/\">");
            result.append(correctURL(partsUrl[i]));
            result.append("</a>");
        }

        result.append(separator);
        result.append("<span class=\"active\">");
        result.append(correctURL(partsUrl[length-1]));
        result.append("</span>");



//
//        String result = null;
//        if (partsUrl.length==2) {
//            result = String.format("<a href=\"/\">HOME</a>%s<span class=\"active\">%s</span>",
//                 separator, correctURL(partsUrl[1]));
//        } else {
//            if (partsUrl[2].contains(".")) {
//                partsUrl[2] = partsUrl[2].substring(0,partsUrl[2].indexOf("."));
//            }
//            result = String.format("<a href=\"/\">HOME</a>%s<a href=\"/%s/\">%s</a>%s<span class=\"active\">%s</span>",
//                    separator, partsUrl[1], correctURL(partsUrl[1]), separator, correctURL(partsUrl[2]));
//        }

        System.out.println(Arrays.toString(partsUrl));
        System.out.println(result);
        System.out.println("<a href=\"/\">HOME</a> * <span class=\"active\">DOCS</span>");

        System.out.println(result.toString().equals("<a href=\"/\">HOME</a> * <span class=\"active\">DOCS</span>"));


    }
    public static String correctURL (String text) {
        if (text.length() <= 30) {
            text = text.toUpperCase().replaceAll("-"," ");
            return text;
        } else {
            String[] words = text.split("-");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase("the") ||
                        words[i].equalsIgnoreCase("of") ||
                        words[i].equalsIgnoreCase("in") ||
                        words[i].equalsIgnoreCase("from") ||
                        words[i].equalsIgnoreCase("by") ||
                        words[i].equalsIgnoreCase("with") ||
                        words[i].equalsIgnoreCase("and") ||
                        words[i].equalsIgnoreCase("or") ||
                        words[i].equalsIgnoreCase("for") ||
                        words[i].equalsIgnoreCase("to") ||
                        words[i].equalsIgnoreCase("at") ||
                        words[i].equalsIgnoreCase("a")) {
                    words[i] = "";
                } else {
                    words[i] = String.valueOf(words[i].toUpperCase().charAt(0));
                }
            }
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word);
            }
            return result.toString();
        }

    }
}
