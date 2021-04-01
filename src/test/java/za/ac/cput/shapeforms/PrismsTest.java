package za.ac.cput.shapeforms;

//Student Name - Lana Africa
// Student Number - 216166640

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class PrismsTest {

    private Prisms prisms1;
    private Prisms prisms2;
    private Prisms prisms3;

    @BeforeEach

    public void setUp() {

        prisms1 = new Prisms();
        prisms2 = new Prisms();
        prisms1 = prisms3;
    }

    @Test
    public void testIdentiy() {
        assertSame(prisms1, prisms3);
        assertNotSame(prisms1, prisms2);
    }

    @Test
    public void testEquality() {
        assertEquals(prisms1, prisms3);
        assertNotEquals(prisms1, prisms2);

    }

    @Test
    @Disabled
    public void skippedTest() {
        assertSame(prisms1, prisms3);

    }

    @Test
    public void failingTest() {
        assertTrue(false);

    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() {
        assertNotEquals(prisms1, prisms2);

    }

}
