package advancedJavaPractice.firstDay.solution.zad4;

public class Main {

	public static void main(String[] args) {
		Storage storage = new Storage();
		storage.addToStorage("dayOfAWeek", "Monday");
		storage.addToStorage("dayOfAWeek", "Tuesday");
		storage.addToStorage("dayOfAWeek", "Wednesday");
		storage.addToStorage("dayOfAWeek", "Thursday");
		storage.addToStorage("dayOfAWeek", "Friday");
		storage.addToStorage("dayOfAWeek", "Saturday");
		storage.addToStorage("dayOfAWeek", "Sunday");

		storage.addToStorage("weekDay", "Monday");
		storage.addToStorage("weekDay", "Tuesday");
		storage.addToStorage("weekDay", "Wednesday");
		storage.addToStorage("weekDay", "Thursday");
		storage.addToStorage("weekDay", "Friday");

		storage.addToStorage("weekend", "Saturday");
		storage.addToStorage("weekend", "Sunday");


		storage.printValues("weekDay");
		storage.printValues("dupa");

		storage.findKeysByValue("Monday");
	}

}
