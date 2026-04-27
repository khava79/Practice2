package CleanCode;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
