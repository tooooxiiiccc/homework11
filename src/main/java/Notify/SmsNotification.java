package Notify;

public class SmsNotification extends Notification {
    private final String phoneNumber;

    public SmsNotification(String phoneNumber, String message) {
        super(message, Priority.HIGH);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + phoneNumber + " " + getMessage());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
