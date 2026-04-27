package CleanCode;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        EmailService emailService = new EmailService();
        InvoiceService invoiceService = new InvoiceService();

        order.processOrder();
        emailService.sendEmailConfirmation();
        invoiceService.generateInvoice();
    }
}
