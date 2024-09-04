import com.example.quaternarycalculator.MultiNumOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiNumOperationsTests {
    @Test
    public void testAddValidNumbers() {
        String result = MultiNumOperations.add("1", "3");
        assertEquals("10", result);
    }

    @Test
    public void testSubtractValidNumbers() {
        String result = MultiNumOperations.subtract("3", "2");
        assertEquals("1", result);
    }

    @Test
    public void testMultiplyValidNumbers() {
        String result = MultiNumOperations.multiply("3", "2");
        assertEquals("12", result);
    }

    @Test
    public void testAddInvalidNumbers() {
        try {
            MultiNumOperations.add(null, null);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    @Test
    public void testSubtractInvalidNumbers() {
        try {
            MultiNumOperations.subtract("a", "b");
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    @Test
    public void testMultiplyInvalidNumbers() {
        try {
            MultiNumOperations.multiply(null, null);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    @Test
    public void testDivideInvalidNumbers() {
        try {
            MultiNumOperations.divide("a", "b");
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    @Test
    public void testAddValidQuaternaryNumber() {
        String result = MultiNumOperations.add("1", "13");
        assertEquals("20", result);
    }

    @Test
    public void testSubtractValidQuaternaryNumbers() {
        String result = MultiNumOperations.subtract("11", "2");
        assertEquals("3", result);
    }

    @Test
    public void testMultiplyValidQuaternaryNumbers() {
        String result = MultiNumOperations.multiply("1", "3");
        assertEquals("3", result);
    }

    @Test
    public void testDivideValidQuaternaryNumbers() {
        String result = MultiNumOperations.divide("12", "2");
        assertEquals("3", result);
    }
}

