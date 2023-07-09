package advancedJavaPractice.secondDay.solution.zad26;

import java.util.List;

public class Main {

	public static List<Model> getAllModels(List<Manufacturer> manufacturers) {
		return List.of();
	}

	public static void main(String[] args) {

		Car subaru1 = new Car("Subcio", "Subaru Tomka", CarType.SEDAN);
		Car subaru2 = new Car("Impreza", "Subaru Mechanika", CarType.CABRIO);
		Car subaru3 = new Car("Śmigacz", "Subaru Pawła", CarType.HATCHBACK);

		Car skoda1 = new Car("Złomek", "Skoda Tomka", CarType.SEDAN);
		Car skoda2 = new Car("Służbowy", "Służbowe auto Tomka", CarType.COUPE);
		Car skoda3 = new Car("Służbowy żony", "Służbowe auto Oli", CarType.SEDAN);

		Model model1 = new Model("Sybaru Impreza", 1990, List.of(subaru1, subaru2));
		Model model2 = new Model("Sybaru XV", 2010, List.of(subaru3));

		Model model3 = new Model("Skoda Fabia", 1985, List.of(skoda1));
		Model model4 = new Model("Skoda Octavia", 1990, List.of(skoda2, skoda3));
		Model model5 = new Model("Skoda Rooster", 2000, List.of());

		Manufacturer subaru = new Manufacturer("Subaru", 1953, List.of(model1, model2));
		Manufacturer skoda = new Manufacturer("Skoda", 1895, List.of(model3, model4, model5));

		List<Manufacturer> manufacturers = List.of(subaru, skoda);

		System.out.println(getAllModels(manufacturers));
	}

}
