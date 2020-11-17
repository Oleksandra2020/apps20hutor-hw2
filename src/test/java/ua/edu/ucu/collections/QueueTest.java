package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testPeek() {
        Object[] list = {2, 3, 4 ,5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Queue q = new Queue(list1);
        Object expected = 2;
        assertEquals(expected, q.peek());
    }

    @Test
    public void testDequeue() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Queue q = new Queue(list1);
        Object actualVal = q.dequeue();
        Object[] expectedArr = {3, 4, 5};
        Object expectedVal = 2;
        assertEquals(expectedVal, actualVal);
        assertArrayEquals(expectedArr, q.getQueue().toArray());
    }

    @Test
    public void testEnqueue() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Queue q = new Queue(list1);
        q.enqueue(6);
        Object[] expectedArr = {2, 3, 4, 5, 6};
        assertArrayEquals(expectedArr, q.getQueue().toArray());
    }
}
