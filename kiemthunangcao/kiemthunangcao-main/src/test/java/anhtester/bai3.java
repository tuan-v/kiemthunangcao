package anhtester;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class bai3 {
    // 3. Tính trung bình cộng
    public double average(List<Integer> numbers) {
        if (numbers.isEmpty()) throw new ArithmeticException("List is empty");
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testAverageEmptyList() {
        average(Arrays.asList());
    }

    @Test
    public void testAverage() {
        assertEquals(3.0, average(Arrays.asList(1, 2, 3, 4, 5)), 0.001);
        assertEquals(5.0, average(Arrays.asList(5, 5, 5, 5)), 0.001);
        assertEquals(-2.0, average(Arrays.asList(-4, 0)), 0.001);
    }
}
