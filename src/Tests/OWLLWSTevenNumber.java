import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OWLLWSTevenNumber {
    private OneWayLinkedListWithSentinel<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new OneWayLinkedListWithSentinel<>();
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    public void testAddAndGet() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
    }

    @Test
    public void testAddAt() {
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);

        assertEquals(4, list.size());
        assertEquals(10, (int)list.get(0));
        assertEquals(20, (int)list.get(1));
        assertEquals(30, (int)list.get(2));
        assertEquals(40, (int)list.get(3));
    }

    @Test
    public void testRemove() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertTrue(list.remove((Integer)3));
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
    }

    @Test
    public void testSet() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        assertEquals(20, (int)list.set(1, 50));
        assertEquals(50, (int)list.get(1));
    }
}