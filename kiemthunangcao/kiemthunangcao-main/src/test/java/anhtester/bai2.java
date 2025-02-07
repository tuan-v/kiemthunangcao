package anhtester;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class bai2 {
    // 2. Kiểm tra phép chia
    public int divide(int a, int b) {
        return a / b;
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        divide(10, 0);
    }

    @Test
    public void testDivide() {
        assertEquals(2, divide(10, 5));
        assertEquals(0, divide(0, 5));
        assertEquals(-2, divide(-10, 5));
        assertEquals(1, divide(-5, -5));
        assertEquals(0, divide(1, 3));
        assertEquals(Integer.MAX_VALUE, divide(Integer.MAX_VALUE, 1));
        assertEquals(0, divide(1, Integer.MAX_VALUE));
        assertEquals(-1, divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}
