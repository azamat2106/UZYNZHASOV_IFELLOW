import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RunTest {

    @Test
    @DisplayName("Тест слияния двух массивов")
    public void testMergeArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] merged = mergeArrays(arr1, arr2);
        assertArrayEquals(expected, merged, "Ошибка: Неправильный результат слияния массивов");
    }

    private int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    @Test
    @DisplayName("Тест проверки наличия элемента в строке")
    public void testStringContains() {
        String str = "Hello, World!";
        boolean contains = stringContains(str, "Java");
        assertFalse(contains, "Ошибка: Ожидалось, что строка не содержит 'Java'");
    }

    private boolean stringContains(String str, String subStr) {
        return str.contains(subStr);
    }

    @Test
    @DisplayName("Тест проверки на равенство двух строк")
    public void testStringsEquality() {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = stringsAreEqual(str1, str2);
        assertFalse(areEqual, "Ошибка: Ожидалось, что строки не равны");
    }

    private boolean stringsAreEqual(String str1, String str2) {
        return str1.equals(str2);
    }
}
