package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testAdd() {
        Object[] list = {2, 3, 4, 5};
        Object[] list1 = {2, 3, 4, 5, 6};
        Object[] list2 = {2, 3, 1, 4, 5, 6};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        ImmutableList newImmutableLinkedList = immutableLinkedList.add(6);
        ImmutableList finalImmutableLinkedList = newImmutableLinkedList.add(2, 1);

        assertArrayEquals(list, immutableLinkedList.toArray());
        assertArrayEquals(list1, newImmutableLinkedList.toArray());
        assertArrayEquals(list2, finalImmutableLinkedList.toArray());
    }

    @Test
    public void testAddAll() {
        Object[] list = {2, 3, 4, 5};
        Object[] list1 = {2, 3, 4, 5, 6};
        Object[] expectedList = {2, 3, 4, 5, 2, 3, 4, 5, 6};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        ImmutableList newImmutableLinkedList = immutableLinkedList.addAll(list1);

        assertArrayEquals(expectedList, newImmutableLinkedList.toArray());
        assertArrayEquals(list, immutableLinkedList.toArray());

        Object[] expectedList1 = {2, 3, 2, 3, 4, 5, 4, 5, 6};
        ImmutableList immutableLinkedList1 = new ImmutableLinkedList(list1);
        ImmutableList newImmutableLinkedList1 = immutableLinkedList1.addAll(2, list);
        assertArrayEquals(expectedList1, newImmutableLinkedList1.toArray());
    }

    @Test
    public void testGet() {
        Object[] list = {2, 3, 4, 5};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        Object e = 3;
        assertEquals(immutableLinkedList.get(1), e);
    }

    @Test
    public void testRemove() {
        Object[] list = {2, 3, 4, 5};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        Object[] expectedList = {2, 4, 5};
        ImmutableList newImmutableLinkedList = immutableLinkedList.remove(1);

        assertArrayEquals(list, immutableLinkedList.toArray());
        assertArrayEquals(expectedList, newImmutableLinkedList.toArray());

        Object[] expectedList1 = {2, 4};
        ImmutableList newImmutableLinkedList1 = newImmutableLinkedList.remove(2);
        assertArrayEquals(expectedList1, newImmutableLinkedList1.toArray());
    }

    @Test
    public void testSet() {
        Object[] list = {2, 3, 4, 5};
        Object[] expectedList = {2, 1, 4, 5};

        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        ImmutableList newImmutableLinkedList = immutableLinkedList.set(1, 1);
        assertArrayEquals(expectedList, newImmutableLinkedList.toArray());
    }

    @Test
    public void testIndexOf() {
        Object[] list = {2, 3, 4, 5};
        int expected = 1;
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        int actual = immutableLinkedList.indexOf(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Object[] list = {2, 3, 4, 5};
        int expected = 4;
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        int actual = immutableLinkedList.size();
        assertEquals(expected, actual);
    }
    @Test
    public void testClear() {
        Object[] list = {2, 3, 4, 5};
        Object[] list1 = {};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        ImmutableList newImmutableLinkedList = immutableLinkedList.clear();

        assertArrayEquals(list, immutableLinkedList.toArray());
        assertArrayEquals(list1, newImmutableLinkedList.toArray());
    }

    @Test
    public void testIsEmpty() {
        Object[] list = {2, 3, 4, 5};
        Object[] list1 = {};
        ImmutableList immutableLinkedList = new ImmutableLinkedList(list);
        ImmutableList newImmutableLinkedList = new ImmutableLinkedList(list1);

        assertFalse(immutableLinkedList.isEmpty());
        assertTrue(newImmutableLinkedList.isEmpty());
    }

    @Test
    public void testToArray() {
        Object[] list = {2, 3, 4, 5};
        ImmutableList list1 = new ImmutableLinkedList(list);
        assertArrayEquals(list, list1.toArray());
    }

    @Test
    public void testToString() {
        Object[] list = {2, 3, 4, 5};
        ImmutableList list1 = new ImmutableLinkedList(list);
        assertEquals(Arrays.toString(list), list1.toString());
    }

    @Test
    public void testAddFirst() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        ImmutableLinkedList newList = list1.addFirst(2);

        Object[] finalList = {2, 2, 3, 4, 5};
        assertArrayEquals(finalList, newList.toArray());
    }

    @Test
    public void testAddLast() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        ImmutableLinkedList newList = list1.addLast(2);

        Object[] finalList = {2, 3, 4, 5, 2};
        assertArrayEquals(finalList, newList.toArray());
    }

    @Test
    public void testGetFirst() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Object expected = 2;
        Object actual = list1.getFirst();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLast() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        Object expected = 5;
        Object actual = list1.getLast();
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFirst() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        ImmutableLinkedList newList = list1.removeFirst();

        Object[] finalList = {3, 4, 5};
        assertArrayEquals(finalList, newList.toArray());
    }

    @Test
    public void testRemoveLast() {
        Object[] list = {2, 3, 4, 5};
        ImmutableLinkedList list1 = new ImmutableLinkedList(list);
        ImmutableLinkedList newList = list1.removeLast();

        Object[] finalList = {2, 3, 4};
        assertArrayEquals(finalList, newList.toArray());
    }
}
