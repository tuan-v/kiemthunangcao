package anhtester;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class bai1 {
    // 1. Kiểm tra phép nhân
    public int multiply(int a, int b) {
        return a * b;
    }
    @Test
    public void multiply(){
        assertEquals(20, multiply(4, 5));
        assertEquals(0, multiply(0, 100));
        assertEquals(-15, multiply(-3, 5));
        assertEquals(25, multiply(-5, -5));
        assertEquals(1, multiply(1, 1));
        assertEquals(-1, multiply(1, -1));
        assertEquals(1000000, multiply(1000, 1000));
        assertEquals(0, multiply(0, 0));
        assertEquals(Integer.MAX_VALUE, multiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, multiply(Integer.MIN_VALUE, 1));
    }


}
