package training.locale;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocaleHorstmann {
    public static void main(String[] args) {



        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

//        Map<String, String> languagesNames = locales.collect(Collectors.toMap(
//                Locale::getDisplayLanguage,
//                loc -> loc.getDisplayLanguage(loc),
//                (existingValue, newValue) -> existingValue
//        ));
//        languagesNames.forEach((key, value) -> System.out.println(key + ": " + value));

//        Map<String, Set<String>> countryLanguagesSet = locales.collect(
//                Collectors.toMap(
//                        Locale::getDisplayCountry,
//                        l -> Collections.singleton(l.getDisplayLanguage()),
//                        (a, b) -> {
//                            var union = new HashSet<>(a);
//                            union.addAll(b);
//                            return union;
//                        }
//                )
//        );
//        countryLanguagesSet.forEach((country, languages) -> {
//            System.out.println("Country: " + country + ". \t Languages: " + languages);
//        });


//        locales.collect(Collectors.groupingBy(Locale::getDisplayLanguage)).entrySet().forEach(System.out::println);


        Map<Boolean, List<Locale>> en = locales.collect(Collectors.partitioningBy(loc -> loc.getLanguage().equals("en")));
        List<Locale> locales1 = en.get(true);
        locales1.forEach(System.out::println);
    }
}
