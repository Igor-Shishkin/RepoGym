package sda.advancedJava.dayForth;

import sda.advancedJava.dayForth.models.PersonDTO;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import sda.advancedJava.dayForth.models.Car;
import sda.advancedJava.dayForth.models.utils.Data;
import sda.advancedJava.dayForth.models.utils.Person;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        List<Person> people = null;
        try {
            people = Data.getPeople();
        } catch (IOException e) {
            System.out.println("Nie udało się");
        }

        //osoby młodsze lub równe 18 lat
        final int limit = 10;
        final int ageLimit = 18;
        List<Person> youngPeople = Lists.newArrayList();
        for (Person person : people) {
            if (person.getAge() <=18) {
                youngPeople.add(person);
                if (youngPeople.size() == 10){
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);

        //podejście deklaratywne
        System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^STREAM^^^^^^^^^^^^^^^^^^^^");
        List<Person> youngPeople2 = Lists.newArrayList();
        youngPeople2 = people
                .stream()
                .filter(person -> person.getAge() <= ageLimit)
                .limit(10)
                .collect(Collectors.toList());

        List<Person> finalPeople = people;
        System.out.println("iterowanie po elementach listy według indeksu na liście 'parzyste'");
        IntStream.iterate(0,operand -> operand+1)
                .filter(number -> number%2 == 0)
                .limit(20)
                .forEach(index -> {
                    Person person = finalPeople.get(index);
                    System.out.println(index + " -> " + person);
                });
        IntStream.range(0, people.size())
                .limit(15)
                .forEach(index -> {
            Person person = finalPeople.get(index);
            System.out.println(index + " -> " + person);
        });

        System.out.println("\n+++++++++++++++++++++++++++++++++++\npobieranie wartości minim");
        List<Integer> numbers = ImmutableList.of(1,2,3,4,5,6,0,7,8,45,3434,5,4,0,0,-1,33,6);
        Integer min = numbers
                .stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(min + "\n");

        numbers.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(value -> System.out.println(value + " "));

        //pobrać listę aut o kolorze 'Mauv' a potem pobrać z tych najtańsze

        /*List<Car> cars = Data.getCars();
        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Mauv"))
                .mapToDouble()
*/

  /*      Predicate<Car> carPredicate = car -> car.getPrice() < 2000;
        List<Car>  carFiltered = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());

        */

        // Uzyskaj zbiór niepowtarzalnych wartości
        System.out.println("Uzyskaj zbiór niepowtarzalnych wartości");
        numbers = ImmutableList.of(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6,77,7,7,777,77,77,77,0);
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
        Set<Integer> collect = numbers
                .stream()
                .collect(Collectors.toSet());
        System.out.println(collect);

        new HashSet<>(numbers).forEach(System.out::print); // Można wywoływać metody na gotowym obiekcie, nie trzeba zawsze przypisywać referencji do zmiennej
        Set<Integer> numSet = new HashSet<>(numbers);
        numSet.forEach(System.out::print);
        System.out.println();
        System.out.println(new HashSet<>(numbers));

        List<Car> cars = Data.getCars();

        // Pobrać listę aut o kolorze `Mauv` a następnie pobrać najtańszy z wszystkich o tym kolorze
        double minCarValue = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Mauv"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(10);
        System.out.println(minCarValue);

        Predicate<Car> carPredicate = car -> car.getPrice() < 2000;

        List<Car> carFiltered = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());
        System.out.println(carFiltered.size());

        List<PersonDTO> dtos = people
                .stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());

        dtos.forEach(System.out::println);

    }

}
