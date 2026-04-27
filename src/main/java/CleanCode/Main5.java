package CleanCode;

public class Main5 {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);
        service.sendNotification("Привет!");
    }
}
