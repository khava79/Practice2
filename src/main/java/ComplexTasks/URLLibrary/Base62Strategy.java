package ComplexTasks.URLLibrary;

import java.util.concurrent.atomic.AtomicLong;

public class Base62Strategy implements ShorteningStrategy {
    private static final String ALPHABET = "abcdefghigklmnopqrstuvwxyzABCDEFGKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE = ALPHABET.length();
    private static final AtomicLong counter = new AtomicLong(1);

    @Override
    public String shorten(String url) {
        long num = counter.getAndIncrement();
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int rem = (int) (num % BASE);
            sb.append(ALPHABET.charAt(rem));
            num /= BASE;
        }
        return sb.reverse().toString();
    }
}
