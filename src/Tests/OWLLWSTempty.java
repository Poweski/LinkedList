import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OWLLWSTempty {
    private OneWayLinkedListWithSentinel<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new OneWayLinkedListWithSentinel<>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
    }
    @Test
    public void testSize() {
        assertEquals(0, list.size());
    }
    @Test
    public void testAddToEmptyList() {
        assertTrue(list.add(5));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(5), list.get(0));
    }
    @Test
    public void testAddAtIndexToEmptyList() {
        assertFalse(list.add(-1, 5));
        assertTrue(list.add(0, 5));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(5), list.get(0));
    }
    @Test
    public void testRemoveFromEmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    public void testRemoveValueFromEmptyList() {
        assertFalse(list.remove((Integer)5));
    }

    @Test
    public void testGetFromEmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    public void testSetInEmptyList() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, 5));
    }

    @Test
    public void testRemoveNullValueFromEmptyList() {
        assertFalse(list.remove(null));
    }
}
