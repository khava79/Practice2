package CleanCode;
//Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}

