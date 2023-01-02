package Iterator.IteratorTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate<Object> implements Aggregate<Object> {
    private List<Object> elements = new ArrayList<>();
    int currentindex = 0;

    @Override
    public void add(Object obj) {
        elements.add(obj);
        currentindex++;
    }

    @Override
    public void remove() {
        elements.remove(currentindex--);

    }


    @Override
    public Iterator<Object> createIterator() {
        return new ConcreteIterator<Object>(elements);
    }

}
