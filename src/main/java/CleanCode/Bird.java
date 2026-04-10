package CleanCode;
//Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.

abstract class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Птица издаёт звуки");
    }
}

