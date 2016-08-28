package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMLinkedList<T> {

    NMNodeInterface<T> firstNode;
    NMNodeInterface<T> lastNode;
    int size;

    public NMLinkedList() {
        this.firstNode = new NMTopNodeConcrete<T>();
        this.lastNode = new NMBottomNodeConcrete<T>();
        try {
            this.firstNode.setNext(this.lastNode);
            this.lastNode.setPrev(this.firstNode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(T data) {
        this.size++;
        NMNodeInterface<T> newNode = new NMNodeConcrete<T>(data);
        NMNodeInterface<T> firstData;
        try {
            firstData = this.firstNode.getNext();
            firstData.setPrev(newNode);
            this.firstNode.setNext(newNode);
            newNode.setPrev(this.firstNode);
            newNode.setNext(firstData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T removeLast() throws Exception {
        NMNodeInterface<T> lastData = this.lastNode.getPrev();
        this.lastNode.setPrev(lastData.getPrev());
        lastData.getPrev().setNext(this.lastNode);
        this.size--;
        return lastData.getData();
    }
}
