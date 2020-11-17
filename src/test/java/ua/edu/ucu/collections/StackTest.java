package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class StackTest {
    
    @Test
    public void testPeek() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Stack s = new Stack(list1);
        Object actual = s.peek();
        Object expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        Object[] list = {2, 3, 4, 5};
        Object[] expectedArr = {2, 3, 4};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Stack s = new Stack(list1);
        Object actual = s.pop();
        Object expected = 5;
        assertEquals(expected, actual);
        assertArrayEquals(expectedArr, s.getStack().toArray());
    }

    @Test
    public void testPush() {
        Object[] list = {2, 3, 4, 5};
        Object[] expectedArr = {2, 3, 4, 5, 6};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Stack s = new Stack(list1);
        s.push(6);
        assertArrayEquals(expectedArr, s.getStack().toArray());
    }
    
}
