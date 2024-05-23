# Zadanie 8.
Zaimplementuj interfejs `Validator`, który będzie zawierać w swojej deklaracji metodę `boolean validate(Parcel input)`.

Stwórz klasę `Parcel` z parametrami:
* int xLength 
* int yLength
* int zLength
* float weight
* boolean isExpress

Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, 
czy każdy z rozmiarów nie jest mniejszy niż 30 (wszystkie większe niż 30), 
czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true. 
W przypadku błędów, powinien o nich poinformować użytkownika.