package student.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import student.Main;

public class MainTest {
    // TODO: Add tests here
    @Test
    public void testExample() {
        Main main = new Main();
        int expected = 2;
        int actual = main.add(2, 2);
        assertEquals(expected, actual);
    }

}
