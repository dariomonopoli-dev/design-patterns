package Composite.CompositeTemplate;

import Composite.CompositeExample.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Component{

    ArrayList components = new ArrayList();
    String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {

        components.add(component);
    }
    public void remove(Component component) {

        components.remove(component);
    }
    public Component getChild(int i) {

        return (Component) components.get(i);
    }


    public void operation() {
        System.out.print("\n" + name);
        System.out.println("---------------------");
        Iterator iterator = components.iterator();
        while (iterator.hasNext()) {
            Component aComponent = (Component) iterator.next();
            aComponent.operation();
        }
    }
}
