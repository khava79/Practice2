package ComplexTasks;

public class Main3 {
    public static void main(String[] args) {

        Book book = new BookBuilder()
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel")
                .build();

        BookInterface proxy = new BookProxy(
                book.getTitle(),
                book.getAuthor(),
                book.getDescription()
        );

        System.out.println("Book created");

        String content = proxy.getContent();

        System.out.println("Content: " + content);

    }
}
