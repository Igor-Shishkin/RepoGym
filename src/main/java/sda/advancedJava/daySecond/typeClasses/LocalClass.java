package sda.advancedJava.daySecond.typeClasses;

public class LocalClass {
    public static void main(String[] args) {
        String pair = createPair("Rudy", 102);
        System.out.println(pair);

    }
    public static String createPair(String key, int value) {
        class Pair {
            String key;
            int value;

            @Override
            public String toString() {
                return "Pair{" +
                        "key='" + key + '\'' +
                        ", value=" + value +
                        '}';
            }
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;

        System.out.println(pair);

        return pair.toString();
    }
}
