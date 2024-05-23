package sda.selfStudyJava.goodPractices.factoryMethod;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification smsNotification = notificationFactory.createNotification("SMS");
        smsNotification.notifyUser();

        String textNumber = "5";
        Integer wrappedNumber = Integer.valueOf(textNumber);
        Integer wrappedNumber2 = Integer.parseInt(textNumber);

        System.out.println(wrappedNumber);
        System.out.println(wrappedNumber2);
    }
}
