# Zadanie 16
Stwórz klasę enum `Runner` ze stałymi `BEGINNER`, `INTERMEDIATE`, `ADVANCED`. Enum powinien posiadać dwa parametry:
* minimalny czas przebiegnięcia maratonu w minutach
* maksymalny czas przebiegnięcia maratonu w minutach

Dodatkowo enum `Runner` powinien zawierać metodę statyczną getFitnessLevel(), która przyjmuje na
wejściu dowolny czas przebiegnięcia maratonu, a jako rezultat powinna zwracać konkretny obiekt Runner
na podstawie przekazanego czasu