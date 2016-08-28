package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMNode<T> {
    T data;
    NMNode<T> next;

    public NMNode(T data, NMNode<T> node) {
        this.data = data;
        this.next = node;
    }

    public NMNode<T> getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public void removeNext() {
        this.next = null;
    }
}
