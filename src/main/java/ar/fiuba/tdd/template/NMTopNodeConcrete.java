package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMTopNodeConcrete<T> implements NMNodeInterface<T> {
    NMNodeInterface<T> next;

    @Override
    public T getData() throws Exception {
        throw new Exception("Top can't get data");
    }

    @Override
    public void setPrev(NMNodeInterface<T> prev) throws Exception {
        throw new Exception("Top can't set prev");
    }

    @Override
    public void setNext(NMNodeInterface<T> next) {
        this.next = next;
    }

    @Override
    public NMNodeInterface<T> getPrev() throws Exception {
        throw new Exception("Top can't get prev");
    }

    @Override
    public NMNodeInterface<T> getNext() {
        return this.next;
    }
}
