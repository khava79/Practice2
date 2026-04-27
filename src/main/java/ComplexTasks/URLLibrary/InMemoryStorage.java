package ComplexTasks.URLLibrary;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryStorage implements UrlStorage {
    private static InMemoryStorage instance;
    private final ConcurrentHashMap<String, String> storage;

    private InMemoryStorage() {
        storage = new ConcurrentHashMap<>();
    }

    public static synchronized InMemoryStorage getInstance() {
        if (instance == null) {
            instance = new InMemoryStorage();
        }
        return instance;
    }

    @Override
    public void save(String shortUrl, String originalUrl) {
        storage.put(shortUrl, originalUrl);
    }

    @Override
    public String get(String shortUrl) {
        return storage.get(shortUrl);
    }
}
