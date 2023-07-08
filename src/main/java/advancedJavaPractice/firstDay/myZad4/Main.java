package advancedJavaPractice.firstDay.myZad4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("DaysOfWeek", "Monday");
        storage.addToStorage("DaysOfWeek", "Friday");
        storage.addToStorage("DaysOfWeek", "Sunday");
        storage.addToStorage("DaysOfWeek", "Thursday");
        storage.addToStorage("DaysOfWeek", "Wednesday");

        storage.addToStorage("Week", "Monday");
        storage.addToStorage("Week", "Friday");
        storage.addToStorage("Week", "Sunday");
        storage.addToStorage("Week", "Thursday");
        storage.addToStorage("Week", "Wednesday");

        storage.addToStorage("Weekend", "Sunday");
        storage.addToStorage("Weekend", "Saturday");

        storage.addToStorage("Month", "January");
        storage.addToStorage("Month", "February");
        storage.addToStorage("Month", "March");
        storage.addToStorage("Month", "April");
        storage.addToStorage("Month", "May");


        storage.findValuesByKey("Week");
        System.out.println("\n");
        storage.findKeysByValue("Sunday");



//        storage.addToStorage("week", new ArrayList<>(List.of("pn", "wt", "śr", "czw", "pt", "sb", "nd")));
//        storage.addToStorage("month", new ArrayList<>(List.of("luty", "maj", "lipiec", "grudzień")));
//        storage.addToStorage("przymiotniki", new ArrayList<>(List.of("pogodny", "smutny", "radosny","luty")));

//        storage.findValues("week");
//        storage.findKey("luty");

    }
}
