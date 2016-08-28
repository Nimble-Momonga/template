package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMNodeConcrete<T> implements NMNodeInterface<T> {
    T data;
    NMNodeInterface<T> prev;
    NMNodeInterface<T> next;

    public NMNodeConcrete(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setPrev(NMNodeInterface<T> prev) {
        this.prev = prev;
    }

    @Override
    public void setNext(NMNodeInterface<T> next) {
        this.next = next;
    }

    @Override
    public NMNodeInterface<T> getPrev() {
        return this.prev;
    }

    @Override
    public NMNodeInterface<T> getNext() {
        return this.next;
    }
}
