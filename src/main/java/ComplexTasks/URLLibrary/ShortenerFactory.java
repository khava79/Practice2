package ComplexTasks.URLLibrary;

public class ShortenerFactory {
    public static ShorteningStrategy create(String type) {
        return switch (type.toLowerCase()) {
            case "base62" -> new Base62Strategy();
            case "uuid" -> new UUIDStrategy();
            default -> throw new IllegalArgumentException("Unknown strategy");
        };
    }
}
