import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTest {

    @Test
    @DisplayName("Тест суммирования двух чисел")
    public void testSum() {
        int result = sum(3, 5);
        assertEquals(8, result, "Ошибка: Ожидалось 8, но получено " + result);
    }

    private int sum(int a, int b) {
        return a + b;
    }

    @Test
    @DisplayName("Тест наличия элемента в массиве")
    public void testArrayContains() {
        int[] array = {1, 2, 3, 4, 5};
        boolean contains = arrayContains(array, 3);
        assertTrue(contains, "Ошибка: Ожидалось, что массив содержит число 3, но не содержит");
    }

    private boolean arrayContains(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    @Test
    @DisplayName("Тест вычисления факториала")
    public void testFactorial() {
        int result = factorial(5);
        assertEquals(120, result, "Ошибка: Ожидалось 120, но получено " + result);
    }

    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
