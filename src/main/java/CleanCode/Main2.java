package CleanCode;

public class Main2 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bitcoin = new BitcoinPayment();

        processor.processPayment(creditCard, 200.0);
        processor.processPayment(paypal, 100.0);
        processor.processPayment(bitcoin, 300.0);
    }
}
