package Notify;


public class Demo {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[]{
                new SmsNotification("89999999999", "Sms-Уведомление"),
                new EmailNotification("danila.morozov@mail.ru", "Email-увдомление"),
                new Notification("Уведомление",Priority.LOW)
        };
        for (Notification notification : notifications) {
            notification.send();

        }
        System.out.println("Общее кол-во уведомлений" + " " + notifications.length);
    }
}