package basicsJava.enumExamples;

public class Main {
    public static void main(String[] args) {
        Animal[] arrayAnimal = new Animal[] {
                new Animal("Jacek", AnimalKind.HORESe, 4),
                new Animal("Jan", AnimalKind.DOG, 2),
                new Animal("Eryk", AnimalKind.SHARK, 99),
                new Animal("Bartek", AnimalKind.CAT, 1)
        };

        for (Animal animal: arrayAnimal) {
            System.out.printf("\nImię: %s;    wiek: %d;    typ: %s;\n",animal.getName(),animal.getAge(),animal.getAnimalKind());
            if (animal.getAnimalKind().isDangerous()) {
                System.out.println("Uważaj, zwieże jest niebezpieczne");
            } else {
                System.out.println("Zwieże jest bezpieczne\n");

            }
        }
    }
}
