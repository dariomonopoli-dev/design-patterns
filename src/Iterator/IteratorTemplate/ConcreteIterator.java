package Iterator.IteratorTemplate;

import java.util.Iterator;
import java.util.List;

public class ConcreteIterator<Object> implements Iterator<Object> {
    private List<Object> elements;
    private int currentIndex;

    public ConcreteIterator(List<Object> elements) {
        this.elements = elements;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public Object next() {
        return elements.get(currentIndex++);
    }

    @Override
    public void remove() {
        elements.remove(--currentIndex);
    }
}
