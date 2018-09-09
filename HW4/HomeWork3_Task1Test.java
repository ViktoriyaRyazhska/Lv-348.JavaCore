package third_lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork3_Task1Test {

    @Test
    public void range() {
        boolean expected = HomeWork3_Task1.range(2.213F);
        assertTrue(expected == true);
        assertFalse(HomeWork3_Task1.range(5.0001F) == true);
    }
}