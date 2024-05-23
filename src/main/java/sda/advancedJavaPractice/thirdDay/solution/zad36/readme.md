# ZADANIE 36.
Utwórz klasę `ThreadPlaygroundRunnable` implementującą interfejs `Runnable` posiadająca pole name typu `String` z konstruktorem publicznym dla tego pola.
Klasa powinna zaimplementować metodę `run()` z interfejsu `Runnable`.
Metoda ta powinna zawierać pętlę liczącą do 10 oraz drukować nazwę aktualnego wątku korzystając z `Thread.currentThread().getName()`, nazwę nadaną w konstruktorze oraz numer aktualnie wykonywanej iteracji pętli.
Utwórz klasę, która ma dwa prywatne statyczne pola typu `Thread` (wątek) oraz standardową metodę `public static void main(String[] args)`.
Następnie zainicjuj pola typu `Thread` używając konstruktora przyjmującego obiekt `Runnable` i przekaż `ThreadPlaygroundRunnable` tworząc go za pomocą konstruktora, za każdym razem podając inną nazwę.
Na każdym z wątków (`Thread`) użyj metody `start()`.