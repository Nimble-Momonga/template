package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public interface NMQueueInterface<T> {

    boolean isEmpty();

    int size();

    void add(T item);

    T top() throws NMQueueEmptyException;

    void remove() throws NMQueueEmptyException;
}
