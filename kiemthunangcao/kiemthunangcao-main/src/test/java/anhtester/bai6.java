package anhtester;

import org.testng.annotations.Test;


import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class bai6 {

    public int findMin(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Array is empty");
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }


    @Test
    public void testFindMinEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> findMin(new int[]{}));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, findMin(new int[]{3, 5, 1, 8, 2}));
        assertEquals(-10, findMin(new int[]{-10, -5, 0, 3}));
        assertEquals(0, findMin(new int[]{0, 0, 0}));
    }
}
