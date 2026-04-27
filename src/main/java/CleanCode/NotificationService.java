package CleanCode;
//Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.

public class NotificationService {
   private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.send(message);
    }
}



