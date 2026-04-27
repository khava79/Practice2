package CleanCode;
//Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.

public class MathOperations {
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        } return sum;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 8));
        System.out.println(math.add(5, 8, 9));
        System.out.println(math.add(5, 8, 9, 4));
    }
}
