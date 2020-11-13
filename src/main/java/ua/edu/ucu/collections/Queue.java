package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private final ImmutableLinkedList queue;

    public Queue(ImmutableLinkedList queue)
    {
        this.queue = queue;
    }

    Object peek()
    {
        return null;
    }

    Object dequeue()
    {
        return null;
    }

    void enqueue(Object e)
    {
        queue.addFirst(e);
    }
}
