package ComplexTasks.URLLibrary;

import java.util.UUID;

public class UUIDStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String url) {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
