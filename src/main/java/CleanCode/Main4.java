package CleanCode;

public class Main4 {
    public static void main(String[] args) {
        Workable programmer = new Programmer();
        programmer.work();

        OfficeWorker worker = new OfficeWorker();
        worker.work();
        worker.eat();
    }
}
