package CleanCode;

public class BitcoinPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
