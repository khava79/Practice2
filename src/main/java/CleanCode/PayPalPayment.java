package CleanCode;

public class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму  + amount");
    }
}
