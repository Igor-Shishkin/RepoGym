package selfStudyJava.codeWars.kyu4.humanReadableDurationFormat;

import java.util.ArrayList;
import java.util.List;

public class HumanReadableDurationFormat {
    public static void main(String[] args) {
        System.out.println(formatDuration(120));
    }
    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        List<String> listOfDurations = new ArrayList<>();

        int year = seconds / 3600 / 24 / 365;
        int days = (seconds % (3600 * 24 * 365)) / (3600 * 24);
        int hours = (seconds % (3600 * 24)) / (3600);
        int minutes = (seconds % 3600) / 60;
        int sec = (seconds % 60);


        if (year == 1) {
            listOfDurations.add("1 year, ");
        } else if (year > 1) {
            listOfDurations.add(String.format("%d years, ", year));
        }

        if (days == 1) {
            listOfDurations.add("1 day, ");
        } else if (days > 1) {
            listOfDurations.add(String.format("%d days, ", days));
        }

        if (hours == 1) {
            listOfDurations.add("1 hour, ");
        } else if (hours > 1) {
            listOfDurations.add(String.format("%d hours, ", hours));
        }

        if (minutes == 1) {
            listOfDurations.add("1 minute, ");
        } else if (minutes > 1) {
            listOfDurations.add(String.format("%d minutes, ", minutes));
        }
        if (sec == 1) {
            listOfDurations.add("1 second, ");
        } else if (sec > 1) {
            listOfDurations.add(String.format("%d seconds, ", sec));
        }

        String result = "";

        if (listOfDurations.size() == 1) {
            result = result.concat(listOfDurations.get(0));
            result = result.substring(0, result.length() - 2);
            return result;
        } else {
            for (int i = 0; i < listOfDurations.size(); i++) {
                if (i == listOfDurations.size() - 1) {
                    result = result.substring(0, result.length() - 2);
                    result = result.concat(" and ");
                }
                result = result.concat(listOfDurations.get(i));
            }
            result = result.substring(0, result.length() - 2);
            return result;
        }
    }
}
