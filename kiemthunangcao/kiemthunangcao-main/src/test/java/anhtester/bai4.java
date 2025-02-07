package anhtester;
import org.testng.annotations.Test;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;


public class bai4 {
    // 4. Hàm lấy phần tử theo chỉ mục

    public int getElementAtIndex(int[] array, int index) {
        return array[index];
    }


    @Test
    public void testGetElementAtIndexOutOfBounds() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            getElementAtIndex(new int[]{1, 2, 3}, 5);
        });
    }


    @Test
    public void testGetElementAtIndex() {
        assertEquals(2, getElementAtIndex(new int[]{1, 2, 3}, 1));  // Kết quả mong đợi là 2
    }
}
