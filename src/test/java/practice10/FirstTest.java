package practice10;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FirstTest {
    /**
     * Тесты для проверки числа на чётность:
     * happy path:
     */
    private final FirstMethod number = new FirstMethod();

    // чётные числа
    @Test
    public void numberIsEven() {
        assertTrue(number.isEven(6));
        assertTrue(number.isEven(0));
        assertTrue(number.isEven(-8));
    }

    // нечётные числа
    @Test
    public void numberIsOdd() {
        assertFalse(number.isEven(5));
        assertFalse(number.isEven(-5));


    }

}
