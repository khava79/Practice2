package ComplexTasks.OnlineLibrary;

public class BookProxy implements BookInterface {
    private String title;
    private String author;
    private String description;
    private RealBook realBook;

    public BookProxy(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getContent() {
        if (realBook == null) {
            realBook = new RealBook(title, author, description);
        }
        return realBook.getContent();
    }
}
