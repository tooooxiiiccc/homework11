package Notify;

public class SmsNotification extends Notification {
    private final String phoneNumber;

    public SmsNotification(String phoneNumber, String message) {
        Priority priority = Priority.LOW;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + phoneNumber);
        super.send();
    }
}
