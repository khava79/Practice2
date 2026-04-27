package CleanCode;

public class OfficeWorker implements Eatable, Workable {
    @Override
    public void work() {
        System.out.println("Сотрудник выполняет задачи");
    }

    @Override
    public void eat() {
        System.out.println("Сотрудник ест обед");
    }

}
