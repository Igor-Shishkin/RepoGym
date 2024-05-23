package sda.basicsJava.practice.carCatalog;

import java.util.Scanner;

/*
Napisz program, który pozwoli stworzyć katalog pojazdów. Do tego zadania wykorzystaj klasę o nazwie "Samochód",
która powinna zawierać następujące pola:

    Marka - przechowuje nazwę marki samochodu (typ: String).
    Model - przechowuje nazwę modelu samochodu (typ: String).
    Rok produkcji - przechowuje rok produkcji samochodu (typ: int).
    Cena - przechowuje cenę samochodu (typ: double).

Klasa "Samochód" powinna mieć konstruktor, który przyjmuje wszystkie pola jako argumenty i ustawia je w odpowiednich
zmiennych. Napisz również metody get i set dla każdego pola.

Twoim zadaniem jest stworzenie klasy "KatalogPojazdów", która będzie zawierać listę obiektów klasy "Samochód" oraz
metody umożliwiające dodawanie nowych samochodów do katalogu, wyświetlanie wszystkich samochodów z katalogu oraz
wyświetlanie samochodów z określonego roku produkcji.

 */
public class Main {
    public static void main(String[] args) {
        CarCatalog catalog = new CarCatalog();
        Scanner scanner = new Scanner(System.in);
        String brand, model;
        int yearOfProduction, choice = 0;
        double price;
        do{
            System.out.println("\nMENU: ");
            System.out.println("1. Dodaj auto.");
            System.out.println("2. Wyświetl listę samochodów.");
            System.out.println("3. Wyświetl samochody z danego roku.");
            System.out.println("0. Wyjście z programu");
            System.out.print("Wybrana opcja: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    scanner.nextLine();
                    System.out.print("\nPodaj markę samochodu: ");
                    brand = scanner.nextLine();
                    System.out.print("\nPodaj model samochodu: ");
                    model = scanner.nextLine();
                    System.out.print("\nPodaj rok produkcji samochodu: ");
                    yearOfProduction = scanner.nextInt();
                    System.out.print("\nPodaj cenę samochodu: ");
                    price = scanner.nextDouble();
                    Car car = new Car(brand, model, yearOfProduction, price);
                    catalog.addCar(car);
                    break;
                case 2:
                    System.out.println("\nPojazdy w katalogu: ");
                    catalog.showAllCars();
                    break;
                case 3:
                    int year;
                    System.out.print("\nPodaj, z którego roku chcesz wyświetlić auta: ");
                    year = scanner.nextInt();
                    System.out.println("\nAuta z roku " + year + ": ");
                    catalog.showCarsFromYear(year);
                    break;
                case 0:
                    System.out.println("WYJŚCIE Z PROGRAMU.");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    break;
            }
        }while(choice != 0);
        scanner.close();
    }
}