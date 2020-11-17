package ua.edu.ucu.collections;


import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack(ImmutableLinkedList stack)
    {
        this.stack = stack;
    }

    public ImmutableLinkedList getStack()
    {
        return stack;
    }

    Object peek()
    {
        return stack.getLast();
    }

    Object pop()
    {
        Object last = stack.getLast();
        stack = stack.removeLast();
        return last;
    }

    void push(Object e)
    {
        stack = stack.addLast(e);
    }
}
