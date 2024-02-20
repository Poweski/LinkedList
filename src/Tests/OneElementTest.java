import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OneElementTest {
    private OneWayLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new OneWayLinkedList<>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testClear() {
        list.add(1);
        assertEquals(1, list.size());
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testAdd() {
        assertTrue(list.add(1));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testAddAtIndex() {
        assertFalse(list.add(-1, 1));
        assertTrue(list.add(0, 2));
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, list.indexOf(1));
        list.add(2);
        assertEquals(-1, list.indexOf(1));
        assertEquals(0, list.indexOf(2));
    }

    @Test
    public void testContains() {
        assertFalse(list.contains(1));
        list.add(1);
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }

    @Test
    public void testGet() {
        list.add(1);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void testSet() {
        list.add(1);
        assertEquals(1, list.set(0, 2));
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(1, 3));
    }
}