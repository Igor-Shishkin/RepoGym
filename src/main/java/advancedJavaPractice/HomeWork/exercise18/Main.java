package advancedJavaPractice.HomeWork.exercise18;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Aspire 3", "Acer",
                new Processor("Intel", 2400,4), 8,
                new VideoCard("NVidea", 2048));
        Computer computer2 = new Computer("Aspire 3", "Acer",
                new Processor("Intel", 2400,4), 8,
                new VideoCard("NVidea", 2048));
        Computer computer3 = new Computer("Aspire 3", "Acer",
                new Processor("Intel", 2400,4), 12,
                new VideoCard("NVidea", 2048));
        System.out.println(computer1);
        System.out.println(computer2);

        System.out.println("if 'computer1==computer2:   " + computer1.equals(computer2));

        System.out.println("************************************");
        System.out.println(computer2);
        System.out.println(computer3);

        System.out.println("if 'computer2==computer3:   " + computer3.equals(computer2));
    }
}
