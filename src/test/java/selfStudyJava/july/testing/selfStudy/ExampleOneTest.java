package selfStudyJava.july.testing.selfStudy;

import org.junit.jupiter.api.Test;
import static org.junit. jupiter.api.Assertions.*;

class ExampleOneTest {
    @Test
    void simpleTest () {
        var calculated = new ExampleOne();
        assertEquals(4, calculated.sumNumbers(1,3));
        assertEquals(59, calculated.sumNumbers(23,36));
        assertEquals(-5, calculated.sumNumbers(-9,4));
        assertEquals(3, calculated.sumNumbers(0,3));
        assertEquals(422, calculated.sumNumbers(100,322));
        assertTrue(calculated.sumNumbers(338,62) == 400);
    }
}