package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMLinkedList<T> {

    NMNode<T> firstNode;
    NMNode<T> currentNode;

    public NMLinkedList() {
        this.firstNode = null;
        this.currentNode = null;
    }

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int size() {
        int size = 0;
        this.currentNode = this.firstNode;
        while (this.currentNode != null) {
            size++;
            this.currentNode = this.currentNode.getNext();
        }
        return size;
    }

    public void addFirst(T item) {
        NMNode<T> newNode = new NMNode<T>(item, this.firstNode);
        this.firstNode = newNode;
    }

    public T removeLast() {
        this.currentNode = this.firstNode;
        NMNode<T> last = null;
        NMNode<T> next = this.currentNode.getNext();
        while (next != null) {
            last = this.currentNode;
            this.currentNode = next;
            next = this.currentNode.getNext();
        }
        last.removeNext();
        return this.currentNode.getData();
    }
}
