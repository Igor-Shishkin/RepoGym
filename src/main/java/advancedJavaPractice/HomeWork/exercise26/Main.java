package advancedJavaPractice.HomeWork.exercise26;
//
//import  .Car;
//import  .CarType;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void printAllModels (List<Manufacturer> manufacturerList) {
        System.out.println("listę wszystkich Modelów");
        manufacturerList.stream()
                .flatMap(x -> x.models.stream())
                .forEach(System.out::println);
        System.out.println("\n");
    }
    public static void printAllCars (List<Manufacturer> manufacturerList) {
        System.out.println("listę wszystkich aut");
        manufacturerList.stream()
                .flatMap(x -> x.models.stream())
                .flatMap(x -> x.cars.stream())
                .forEach(System.out::println);
        System.out.println("\n");
    }
    public static void printAllManufactursNamesAndYears (List<Manufacturer> manufacturerList) {
        System.out.println("listę wszystkich nazw i lat założenia producentów");
        manufacturerList
                .forEach(x -> System.out.println(x.name + ", year of creation: " + x.yearOfCreation));
        System.out.println("\n");
    }


    public static List<String> getAllNamesAndStartYearOfModels (List<Manufacturer> manufacturerList) {
        //listę wszystkich nazw i lat startu produkcji modeli");
        return manufacturerList.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .map(model -> model.name.concat(", name of production start year: ")
                        .concat(Integer.toString(model.productionStartYear)).concat("\n"))
                .collect(Collectors.toList());
    }
    public static List<String> getAllNamesAndDescriptionAllCars (List<Manufacturer> manufacturerList) {
        //listę wszystkich nazw i opisów aut
        return manufacturerList.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .map(car -> car.name.concat(" - ").concat(car.description).concat("\n"))
                .collect(Collectors.toList());
    }
    public static void printAllModelWithEvenYears (List<Manufacturer> manufacturerList) {
        System.out.println("tylko modele z parzystym rokiem startu produkcji");
        manufacturerList.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> (model.productionStartYear%2==0))
                .forEach(System.out::println);
    }

    public static void printCABRIOOddYearModelAndEvenYearManufacturer (List<Manufacturer> manufacturerList) {
        System.out.println("tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu " +
                "i parzystym rokiem założenia producenta");
        manufacturerList.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation%2==0)
//                .peek(System.out::println)
                .flatMap(manufacturer -> manufacturer.models.stream())
//                .peek(System.out::println)
                .filter(model -> model.productionStartYear%2==1)
                .flatMap(model -> model.cars.stream())
//                .peek(System.out::println)
                .filter(car -> car.carType==CarType.CABRIO)
                .forEach(System.out::println);
        System.out.println("\n");
    }
    public static void printSEDANNewer2019AndYearManufacturerOlder1919 (List<Manufacturer> manufacturerList) {
        System.out.println("tylko auta typu SEDAN z modelu nowszego niż 2019 " +
                "oraz rokiem założenia producenta mniejszym niż 1919");
        manufacturerList.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation<1919)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear>2019)
                .flatMap(model -> model.cars.stream())
                .filter(car -> car.carType==CarType.SEDAN)
                .forEach(System.out::println);
        System.out.println("\n");
    }





    

    public static void main(String[] args) {


        Car subaru1 = new Car("Subcio", "Subaru Tomka", CarType.SEDAN);
        Car subaru2 = new Car("Impreza", "Subaru Mechanika", CarType.CABRIO);
        Car subaru3 = new Car("Śmigacz", "Subaru Pawła", CarType.HATCHBACK);

        Car skoda1 = new Car("Złomek", "Skoda Tomka", CarType.SEDAN);
        Car skoda2 = new Car("Służbowy", "Służbowe auto Tomka", CarType.COUPE);
        Car skoda3 = new Car("Służbowy żony", "Służbowe auto Oli", CarType.SEDAN);

        Model model1 = new Model("Sybaru Impreza", 1991, List.of(subaru1, subaru2));
        Model model2 = new Model("Sybaru XV", 2010, List.of(subaru3));

        Model model3 = new Model("Skoda Fabia", 1985, List.of(skoda1));
        Model model4 = new Model("Skoda Octavia", 1990, List.of(skoda2, skoda3));
        Model model5 = new Model("Skoda Rooster", 2020, List.of(skoda3));

        Manufacturer subaru = new Manufacturer("Subaru", 1954, List.of(model1, model2));
        Manufacturer skoda = new Manufacturer("Skoda", 1895, List.of(model3, model4, model5));

        List<Manufacturer> manufacturers = List.of(subaru, skoda);

        printAllModels(manufacturers);
        printAllCars(manufacturers);
        printAllManufactursNamesAndYears(manufacturers);
        System.out.println(getAllNamesAndStartYearOfModels(manufacturers) + "\n");
        System.out.println(getAllNamesAndDescriptionAllCars(manufacturers));
        printAllModelWithEvenYears(manufacturers);
        System.out.println("----------------------\n");
        printCABRIOOddYearModelAndEvenYearManufacturer(manufacturers);
        printSEDANNewer2019AndYearManufacturerOlder1919(manufacturers);

//        System.out.println(getAllModels(manufacturers));
    }
}
