package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ImmutableArrayListTest {
    
    @Test
    public void testAdd() {
        Object[] arrayList = {2, 3, 4, 5};
        Object[] arrayList1 = {2, 3, 4, 5, 6};
        Object[] arrayList2 = {2, 3, 1, 4, 5, 6};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        ImmutableList newImmutableList = immutableList.add(6);
        ImmutableList finalImmutableList = newImmutableList.add(2, 1);

        assertArrayEquals(arrayList, immutableList.toArray());
        assertArrayEquals(arrayList1, newImmutableList.toArray());
        assertArrayEquals(arrayList2, finalImmutableList.toArray());
    }

    @Test
    public void testAddAll() {
        Object[] arrayList = {2, 3, 4, 5};
        Object[] arrayList1 = {2, 3, 4, 5, 6};
        Object[] expectedList = {2, 3, 4, 5, 2, 3, 4, 5, 6};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        ImmutableList newImmutableList = immutableList.addAll(arrayList1);

        assertArrayEquals(expectedList, newImmutableList.toArray());
        assertArrayEquals(arrayList, immutableList.toArray());

        Object[] expectedList1 = {2, 3, 2, 3, 4, 5, 4, 5, 6};
        ImmutableList immutableList1 = new ImmutableArrayList(arrayList1);
        ImmutableList newImmutableList1 = immutableList1.addAll(2, arrayList);
        assertArrayEquals(expectedList1, newImmutableList1.toArray());
    }

    @Test
    public void testGet() {
        Object[] arrayList = {2, 3, 4, 5};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        Object e = 3;
        assertEquals(immutableList.get(1), e);
    }

    @Test
    public void testRemove() {
        Object[] arrayList = {2, 3, 4, 5};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        Object[] expectedList = {2, 4, 5};
        ImmutableList newImmutableList = immutableList.remove(1);
        assertArrayEquals(arrayList, immutableList.toArray());
        assertArrayEquals(expectedList, newImmutableList.toArray());

        Object[] expectedList1 = {2, 4};
        ImmutableList newImmutableList1 = newImmutableList.remove(2);
        assertArrayEquals(expectedList1, newImmutableList1.toArray());
    }

    @Test
    public void testSet() {
        Object[] arrayList = {2, 3, 4, 5};
        Object[] expectedList = {2, 1, 4, 5};

        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        ImmutableList newImmutableList = immutableList.set(1, 1);
        assertArrayEquals(expectedList, newImmutableList.toArray());
    }

    @Test
    public void testIndexOf() {
        Object[] arrayList = {2, 3, 4, 5};
        int expected = 1;
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        int actual = immutableList.indexOf(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Object[] arrayList = {2, 3, 4, 5};
        int expected = 4;
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        int actual = immutableList.size();
        assertEquals(expected, actual);
    }
    @Test
    public void testClear() {
        Object[] arrayList = {2, 3, 4, 5};
        Object[] arrayList1 = {};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        ImmutableList newImmutableList = immutableList.clear();

        assertArrayEquals(arrayList, immutableList.toArray());
        assertArrayEquals(arrayList1, newImmutableList.toArray());
    }

    @Test
    public void testIsEmpty() {
        Object[] arrayList = {2, 3, 4, 5};
        Object[] arrayList1 = {};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        ImmutableList newImmutableList = new ImmutableArrayList(arrayList1);

        assertFalse(immutableList.isEmpty());
        assertTrue(newImmutableList.isEmpty());
    }

    @Test
    public void testToArray() {
        Object[] arrayList = {2, 3, 4, 5};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        assertArrayEquals(arrayList, immutableList.toArray());
    }

    @Test
    public void testToString() {
        Object[] arrayList = {2, 3, 4, 5};
        ImmutableList immutableList = new ImmutableArrayList(arrayList);
        assertEquals(Arrays.toString(arrayList), immutableList.toString());
    }
}
