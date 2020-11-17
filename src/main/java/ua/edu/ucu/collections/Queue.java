package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList queue;

    public Queue(ImmutableLinkedList queue)
    {
        this.queue = queue;
    }

    public ImmutableLinkedList getQueue()
    {
        return queue;
    }

    Object peek()
    {
        return queue.getFirst();
    }

    Object dequeue()
    {
        Object first = queue.getFirst();
        queue = queue.removeFirst();
        return first;
    }

    void enqueue(Object e)
    {
        queue = queue.addLast(e);
    }
}
