import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OWLLWSToddNumber {
    private OneWayLinkedListWithSentinel<Integer> list;

    @BeforeEach
    void setUp() {
        list = new OneWayLinkedListWithSentinel<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    void testIsEmpty() {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(3, list.size());
        list.add(4);
        assertEquals(4, list.size());
        list.remove(1);
        assertEquals(3, list.size());
    }

    @Test
    void testAdd() {
        assertTrue(list.add(4));
        assertEquals(4, list.get(3));
    }

    @Test
    void testAddIndex() {
        assertTrue(list.add(1, 4));
        assertEquals(4, list.get(1));
        assertFalse(list.add(-1, 5));
    }

    @Test
    void testIndexOf() {
        assertEquals(0, list.indexOf(1));
        assertEquals(1, list.indexOf(2));
        assertEquals(2, list.indexOf(3));
        assertEquals(-1, list.indexOf(4));
    }

    @Test
    void testContains() {
        assertTrue(list.contains(2));
        assertFalse(list.contains(4));
    }

    @Test
    void testGet() {
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    void testSet() {
        assertEquals(2, list.set(1, 4));
        assertEquals(4, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 5));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 6));
    }

    @Test
    void testRemove() {
        assertEquals(2, list.remove(1));
        assertEquals(2, list.size());
        assertFalse(list.remove((Integer)4));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
    }
}
