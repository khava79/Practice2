package ComplexTasks.URLLibrary;

public class Main1 {
    public static void main(String[] args) {
        UrlStorage storage = InMemoryStorage.getInstance();

        ShorteningStrategy strategy = ShortenerFactory.create("base62");
        UrlShortenerService service = new UrlShortenerService(strategy, storage);

        String originalUrl = "http://example.com/very/long/url";

        String shortUrl = service.shortenUrl(originalUrl);
        System.out.println("Short URL: " + shortUrl);

        String restoredUrl = service.restoreUrl(shortUrl);
        System.out.println("Restored URL: " + restoredUrl);
    }
}
