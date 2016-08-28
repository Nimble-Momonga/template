package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMQueue<T> implements NMQueueInterface<T> {
    NMLinkedList<T> linkedList;

    public NMQueue() {
        linkedList = new NMLinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public void add(T item) {
        linkedList.addFirst(item);
    }

    @Override
    public T top() throws Exception {
        return linkedList.removeLast();
    }

    @Override
    public void remove() throws Exception {
        linkedList.removeLast();
    }
}
