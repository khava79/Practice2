package practice10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ThirdTest {
    private final ThirdMethod string = new ThirdMethod();

    @Test
    public void isStringReversed() {
        assertEquals("avahk", string.reverse("khava"));
        assertEquals("eldnac", string.reverse("candle"));
        assertEquals("", string.reverse(""));

    }

    @Test
    public void testNull() {
        assertNull(string.reverse(null));
    }


    @ParameterizedTest


    // Тесты должны проверять:
    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)
}
