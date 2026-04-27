package ComplexTasks;

public class RealBook implements BookInterface {
    private String title;
    private String author;
    private String description;
    private String content;

    public RealBook(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
        loadContent();
    }

    public void loadContent() {
        System.out.println("Loading content...");
        this.content = "FULL BOOK TEXT";
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

    @Override
    public String getContent() {
        return content;
    }
}
