package advancedJava.dayThird.collections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        /**
         * Napisz zbiór elementów typu string SET<String>
         * Napisz listę elementów typu string List<String>
         * - na podstawie zbioru i listy utwórz mapę  Map<String, String>
         * - przypisz do zmiennej iterator dla Set a do kolejnej zmiennej iterator dla List
         * - napisz pętle która DOPÓKI są kolejne elementy w kolekcjach (łączenie warunków to jest znak &&)
         *  - w pętli zapisuj do mapy pary klucz i wartość gdzie klucz jest pobrany z set a wartość z List
         *
         */

        Set<String> keySet = new LinkedHashSet<>();
        keySet.add("Pierwszy");
        keySet.add("Drugi");
        keySet.add("Trzeci");
        keySet.add("Czwarty");
        keySet.add("Piąty");

        List<String> valueList = new ArrayList<>();
        valueList.add("Wartość pierwsza");
        valueList.add("Wartość druga");
        valueList.add("Wartość trzecia");
        valueList.add("Wartość czwarta");

        Map<String, String> map = new LinkedHashMap<>();

        Iterator<String> setIterator = keySet.iterator();
        Iterator<String> listIterator = valueList.iterator();

        while (setIterator.hasNext() && listIterator.hasNext()) {
            map.put(setIterator.next(), listIterator.next());
        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println("Klucz: " + stringStringEntry.getKey() + " ,wartość: " + stringStringEntry.getValue());
        }
    }
}
