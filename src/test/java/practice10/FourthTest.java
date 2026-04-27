package practice10;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class FourthTest {
    //Тесты должны проверять:
    //Обычный массив ([3, 5, 7, 2])
    //Один элемент в массиве
    //Отрицательные числа
    //Пустой массив (должно выбрасываться исключение)

    private final FourthMethod numbers = new FourthMethod();

    @Test
    public void checkBasicArray() {
        int[] ar = {3, 5, 7, 2};
        assertEquals(7, numbers.findMax(ar));
    }

    @Test
    public void checkSingleNumber() {
        int[] ar = {1};
        assertEquals(1, numbers.findMax(ar));
    }

    @Test
    public void checkNegativeNumbers() {
        int[] ar = {-4, -3, -9, -2};
        assertEquals(-2, numbers.findMax(ar));
    }

    @Test(expected = NoSuchElementException.class)
    public void checkEmptyArray() {
        int[] ar = {};
        numbers.findMax(ar);
    }
}
