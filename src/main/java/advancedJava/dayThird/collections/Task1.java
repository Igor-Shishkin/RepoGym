package advancedJava.dayThird.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
/**
 * 1. Stworzyć tablicę liczb `Integer[]`, mają być powtórzenia np (1,1,1,1,3,4,5,5,6,777,89)
 * - iterować po elementach tablicy i dodawać każdy element do zbioru `Set<Integer>`
 * - delegować powyższą funkcjonalność do metody `public Set<Integer> convertFrom(Integer[] toConvert)`
 * - wywołaj metodę z main() i przechwyć zwracaną kolekcję, a następnie wydrukuj posortowane
 * - elementy na ekranie
 */

public class Task1 {
    public static void main(String[] args) {
        //Integer[] arrayInt = new Integer[] {999,9993,4,5,5,1,1,1,1,6,78};
        /*Set<Integer> setInteger = new HashSet<>();
        for (int element : arrayInt) {
            setInteger.add(element);
        }*/
        /*Set<Integer> setInteger = convertFrom(new Integer[] {999,9993,4,5,5,1,1,1,1,6,78});
        setInteger.forEach(System.out::println);
         */

        convertFrom(new Integer[] {999,9993,4,5,5,1,1,1,1,6,78}).forEach(System.out::println);
    }

    /*public static Set<Integer> convertFrom(Integer[] toConvert) {
        Set<Integer> setInteger = new TreeSet<>();
        for (int element : toConvert) {
            setInteger.add(element);
        }
        return setInteger;
    }*/

    public static Set<Integer> convertFrom(Integer[] toConvert) {
        return new TreeSet<>(Arrays.asList(toConvert));
    }
}
