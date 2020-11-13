package ua.edu.ucu.collections.immutable;
import java.util.ArrayList;

public class ImmutableArrayList implements ImmutableList {
    private final ArrayList<Object> arrayList;

    public ImmutableArrayList(ArrayList<Object> arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public ImmutableList add(Object e) {
        return add(arrayList.size(), e);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size()+1; i++)
        {
            if (i == index)
            {
                arrayList1.add(e);
            }
            arrayList1.add(arrayList.get(i));

        }
        return new ImmutableArrayList(arrayList1);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(arrayList.size(), c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (i == index)
            {
                for (int j = i; j < c.length; j++)
                {
                    arrayList1.add(c[j]);
                }
            }
            arrayList1.add(arrayList.get(i));
        }
        return new ImmutableArrayList(arrayList1);
    }

    @Override
    public Object get(int index) {
        return arrayList.get(index);
    }

    @Override
    public ImmutableList remove(int index) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (i != index)
            {
                arrayList1.add(arrayList.get(i));
            }
        }
        return new ImmutableArrayList(arrayList1);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (i != index)
            {
                arrayList1.add(arrayList.get(i));
            } else
            {
                arrayList1.add(e);
            }
        }
        return new ImmutableArrayList(arrayList1);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i) == e)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public ImmutableList clear() {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        return new ImmutableArrayList(arrayList1);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.size() == 0;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
        {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
