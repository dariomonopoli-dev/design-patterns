package Iterator.IteratorTemplate;

import java.util.Iterator;

public class Client {


    public static void main(String[] args) {

        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("Hello");
        aggregate.add("Android");
        aggregate.add("Bye");
        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}