package Iterator.IteratorTemplate;

public interface Iterator<T> {

    boolean hasNext();

    Object next();

    void remove();

}