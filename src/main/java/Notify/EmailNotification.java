package Notify;

public class EmailNotification extends Notification {
    private final String email;

    public EmailNotification(String email, String message) {
        super(message,Priority.HIGH);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public void send() {
        System.out.println("Sending email to " + email + " " + getMessage());
    }
}