package anhtester;

import org.junit.jupiter.api.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class UserTest {
    @Test
    void testUserNameNull() {
        User user = new User();
        assertThrows(NullPointerException.class, user::getName);
    }

    @Test
    void testUserName() {
        User user = new User();
        user.setName("Tien Si Nguyen");
        assertEquals("Tien Si Nguyen", user.getName());
    }
}
