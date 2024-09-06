import com.example.quaternarycalculator.oneNum;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class oneNumTest {

    // squareRoot
    @Test
    public void testQuaternarySquareRootValidInput() {
        Assert.assertEquals("2", oneNum.quaternarySquareRoot("10"));
        assertEquals("3", oneNum.quaternarySquareRoot("21"));
        assertEquals("0", oneNum.quaternarySquareRoot("0"));
        assertEquals("1", oneNum.quaternarySquareRoot("1"));
        assertEquals("10", oneNum.quaternarySquareRoot("100"));
    }

    @Test
    public void testQuaternarySquareRootInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquareRoot("1234"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquareRoot("abcd"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquareRoot("3.2"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquareRoot(""));
    }

    // square
    @Test
    public void testQuaternarySquareValidInput() {
        assertEquals("100", oneNum.quaternarySquare("10"));
        assertEquals("1101", oneNum.quaternarySquare("21"));
        assertEquals("0", oneNum.quaternarySquare("0"));   //
        assertEquals("1", oneNum.quaternarySquare("1"));   //
        assertEquals("10000", oneNum.quaternarySquare("100"));
    }

    @Test
    public void testQuaternarySquareInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquare("1234"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquare("abcd"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquare("3.2"));
        assertThrows(IllegalArgumentException.class, () -> oneNum.quaternarySquare(""));
    }
}