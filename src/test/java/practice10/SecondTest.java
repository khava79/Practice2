package practice10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SecondTest {
// Тесты должны проверять:
//Разные строки ("hello", "java", "AEIOU", "")
//null (должно выбрасываться исключение)
//Строки без гласных

    private final SecondMethod strings = new SecondMethod();

    @Test
    public void numberOfVowels() {
        assertEquals(2, strings.countVowels("hello"));
        assertEquals(2, strings.countVowels("java"));
        assertEquals(5, strings.countVowels("AEIOU"));
        assertEquals(0, strings.countVowels(""));
        assertEquals(0, strings.countVowels("klmncp"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        strings.countVowels(null);
    }

}
