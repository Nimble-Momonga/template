package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMBottomNodeConcrete<T> implements NMNodeInterface<T> {
    NMNodeInterface<T> prev;

    @Override
    public T getData() throws Exception {
        throw new Exception("Bottom can't get data");
    }

    @Override
    public void setPrev(NMNodeInterface<T> prev) {
        this.prev = prev;
    }

    @Override
    public void setNext(NMNodeInterface<T> next) throws Exception {
        throw new Exception("Bottom can't set next");
    }

    @Override
    public NMNodeInterface<T> getPrev() {
        return this.prev;
    }

    @Override
    public NMNodeInterface<T> getNext() throws Exception {
        throw new Exception("Bottom can't get next");
    }
}
