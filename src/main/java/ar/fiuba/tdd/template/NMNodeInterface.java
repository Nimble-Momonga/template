package ar.fiuba.tdd.template;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public interface NMNodeInterface<T> {

    T getData() throws Exception;

    void setPrev(NMNodeInterface<T> nodeInterface) throws Exception;

    void setNext(NMNodeInterface<T> nodeInterface) throws Exception;

    NMNodeInterface<T> getPrev() throws Exception;

    NMNodeInterface<T> getNext() throws Exception;
}
