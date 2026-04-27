package CleanCode;

public class Main3 {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Пингвин");
        Bird sparrow = new Sparrow("Воробей");

        penguin.makeSound();
        sparrow.makeSound();

        if (sparrow instanceof Flyable) {
            ((Flyable) sparrow).fly();
        }
        if (penguin instanceof Flyable) {
            ((Flyable) penguin).fly();
        }
    }
}
