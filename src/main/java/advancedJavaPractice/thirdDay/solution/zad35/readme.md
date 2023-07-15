# Zadanie 35.
Utwórz klasę implementującą `Runnable` np. `MyRunnable`. Zaimplementuj metodę `run()`, która wyświetli
nam nazwę aktualnego wątku analogicznie jak w poprzednim ćwiczeniu.
Utwórz klasę z metodą public `static void main(String[] args)`. 
Wewnątrz metody main utwórz zmienną typu klasy stworzonej powyżej np. `MyRunnable` oraz zainicjuj klasę.
Utwórz zmienną typu `Thread` i zainicjuj ją przekazując jako parametr konstruktora implementację interfejsu `Runnable`. 
Na zmiennej typu `Thread` wykonać metodę `start()`.