package Notify;


public class Demo {
    public static void main(String[] args) {
        Notification[] notifications = {
                new SmsNotification("89999999999", "Sms-Уведомление"),
                new EmailNotification("danila.morozov@mail.ru", "Email-увдомление"),
                new Notification("Увдомление", Priority.LOW)
        };
        for (Notification n : notifications) {
            n.send();
        }
        System.out.println("Общее кол-во уведомлений" + " " + notifications.length);
    }
}