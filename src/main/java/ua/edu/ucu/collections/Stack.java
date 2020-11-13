package ua.edu.ucu.collections;


import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private final ImmutableLinkedList stack;

    public Stack(ImmutableLinkedList stack)
    {
        this.stack = stack;
    }

    Object peek()
    {
        return stack.getLast();
    }

    Object pop()
    {
        return stack.removeLast();
    }

    void push(Object e)
    {
        stack.addLast(e);
    }
}
