package advancedJava.daySecond.inheritance;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", 16);
        Animal EW = new EarthWorth("Jan");
        System.out.println(lion.getName());
        System.out.println(lion.getSound());
        System.out.println(lion.getAge());

        System.out.println(EW);

        Marek marek = new Marek();
        Marek marek2 = new Marek();
        Marta marta = new Marta();

        Marek[] tablicaMarka = new Marek[5];
        tablicaMarka[0] = marek;
        tablicaMarka[1] = marek2;

        Kowalscy[] arrK = {marek, marek2, marta};
        for (Kowalscy person : arrK) {
            System.out.println(person);
        }
//        Marek[] tablicaNarka = new Marek[] {marek};



    }
}
