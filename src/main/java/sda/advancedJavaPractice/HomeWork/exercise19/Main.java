package sda.advancedJavaPractice.HomeWork.exercise19;

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

        Laptop laptop1 = new Laptop("ASUS X515JA", "Asus",
                new Processor("Intel Core i5", 3000,4), 8,
                new VideoCard("NVIDIA GeForce GTX 1650", 4096), 48);
        Laptop laptop2 = new Laptop("Aspire 3", "Acer",
                new Processor("Intel", 2400,4), 12,
                new VideoCard("NVidea", 2048), 48);
        Laptop laptop3 = new Laptop("ASUS X515JA", "Asus",
                new Processor("Intel Core i5", 3000,4), 8,
                new VideoCard("NVIDIA GeForce GTX 1650", 4096), 48);

        System.out.println(computer1);
        System.out.println(computer2);

        System.out.println("if 'computer1'=='computer2':   " + computer1.equals(computer2));

        System.out.println("************************************");
        System.out.println(computer2);
        System.out.println(computer3);
        System.out.println("if 'computer2'=='computer3':   " + computer3.equals(computer2));

        System.out.println("************************************");
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println("if 'laptop1'=='laptop2':   " + laptop1.equals(laptop2));

        System.out.println("************************************");
        System.out.println(laptop1);
        System.out.println(laptop3);
        System.out.println("if 'laptop1'=='laptop3':   " + laptop1.equals(laptop3));

        System.out.println("************************************");
        System.out.println(computer3);
        System.out.println(laptop2);
        System.out.println("if 'computer3'=='laptop2':   " + computer3.equals(laptop2));

        System.out.println("************************************");
        System.out.println(laptop2);
        System.out.println(computer3);
        System.out.println("if 'laptop2'=='computer3':   " + laptop2.equals(computer3));
    }
}
