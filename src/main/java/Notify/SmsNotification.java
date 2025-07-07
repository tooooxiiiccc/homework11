package Notify;

public class SmsNotification extends Notification {
    private final String phoneNumber;

    public SmsNotification(String phoneNumber, String message) {
        super(phoneNumber, Priority.LOW);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + phoneNumber);
        super.send();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
