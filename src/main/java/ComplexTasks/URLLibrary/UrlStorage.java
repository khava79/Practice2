package ComplexTasks.URLLibrary;

public interface UrlStorage {
    void save (String shortUrl, String originalUrl);
    String get(String shortUrl);

}
