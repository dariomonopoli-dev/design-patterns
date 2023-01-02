package Iterator.IteratorTemplate;
import java.util.Iterator;

public interface Aggregate<Object> {

    void add(Object o);

    void remove();

    Iterator<Object> createIterator();
}