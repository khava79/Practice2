package CleanCode;
//Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate;
        if (isLoyalCustomer && isFirstPurchase) {
            discountRate = 0.10;
        } else if (isLoyalCustomer) {
            discountRate = 0.05;
        } else if (hasCoupon) {
            discountRate = 0.07;
        } else {
            discountRate = 0.02;
        } return price * (1 - discountRate);
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculateDiscount(20, true, true, false));
        System.out.println(calculator.calculateDiscount(20, true, false, false));
        System.out.println(calculator.calculateDiscount(20, false, true, true));
        System.out.println(calculator.calculateDiscount(20, false, false, false));
    }
}
