package ua.edu.ucu.collections.immutable;

import java.util.List;
import java.util.Arrays;

public class ImmutableLinkedList implements ImmutableList{
    private final List<Object> list;

    public ImmutableLinkedList(List<Object> list)
    {
        this.list = list;
    }

    @Override
    public ImmutableList add(Object e) {
        return add(list.size(), e);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        List<Object> list1 = Arrays.asList();
        for (int i = 0; i < list.size()+1; i++)
        {
            if (i == index)
            {
                list1.add(e);
            }
            list1.add(list.get(i));

        }
        return new ImmutableLinkedList(list1);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(list.size(), c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        List<Object> list1 = Arrays.asList();
        for (int i = 0; i < list.size(); i++)
        {
            if (i == index)
            {
                for (int j = i; j < c.length; j++)
                {
                    list1.add(c[j]);
                }
            }
            list1.add(list.get(i));
        }
        return new ImmutableLinkedList(list1);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public ImmutableList remove(int index) {
        List<Object> list1 = null;
        for (int i = 0; i < list.size(); i++)
        {
            if (i != index)
            {
                list1.add(list.get(i));
            }
        }
        return new ImmutableLinkedList(list1);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        List<Object> list1 = Arrays.asList();
        for (int i = 0; i < list.size(); i++)
        {
            if (i != index)
            {
                list1.add(list.get(i));
            } else
            {
                list1.add(e);
            }
        }
        return new ImmutableLinkedList(list1);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == e)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public ImmutableList clear() {
        List<Object> list1 = Arrays.asList();
        return new ImmutableLinkedList(list1);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public ImmutableLinkedList addFirst(Object e)
    {
        List<Object> list1 = Arrays.asList(e);
        list1.addAll(list);
        return new ImmutableLinkedList(list1);
    }

    public ImmutableLinkedList addLast(Object e)
    {
        List<Object> list1 = Arrays.asList();
        list1.addAll(list);
        list1.add(e);
        return new ImmutableLinkedList(list1);
    }

    public Object getFirst()
    {
        return list.get(0);
    }

    public Object getLast()
    {
        return list.get(list.size()-1);
    }

    public ImmutableLinkedList removeFirst()
    {
        List<Object> list1 = Arrays.asList();
        list1.addAll(list);
        list1.remove(0);
        return new ImmutableLinkedList(list1);
    }

    public  ImmutableLinkedList removeLast()
    {
        List<Object> list1 = Arrays.asList();
        list1.addAll(list);
        list1.remove(list.size()-1);
        return new ImmutableLinkedList(list1);
    }
}
