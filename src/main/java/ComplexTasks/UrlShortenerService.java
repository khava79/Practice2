package ComplexTasks;

public class UrlShortenerService {
    private final ShorteningStrategy strategy;
    private final UrlStorage storage;

    public UrlShortenerService(ShorteningStrategy strategy, UrlStorage storage) {
        this.strategy = strategy;
        this.storage = storage;
    }

    public String shortenUrl(String url) {
        String shortUrl = strategy.shorten(url);
        storage.save(shortUrl, url);
        return shortUrl;
    }

    public String restoreUrl(String shortUrl) {
        return storage.get(shortUrl);
    }
}
