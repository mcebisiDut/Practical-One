public interface IQueueArray<T> {
    void enqueue(T number);
    T dequeue() throws EmptyQueueException;
    T peek() throws EmptyQueueException;
    boolean onqueue(T item);
    int searchqueue(T item);
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}