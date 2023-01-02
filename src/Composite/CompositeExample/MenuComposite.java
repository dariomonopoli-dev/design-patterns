package Composite.CompositeExample;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuComposite extends MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    public MenuComposite(String name) {

        this.name = name;
    }
    public void add(MenuComponent menuComponent) {

        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {

        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {

        return (MenuComponent)menuComponents.get(i);
    }
    public String getName() {

        return name;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println("---------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
        MenuComponent menuComponent =
                (MenuComponent)iterator.next();
        menuComponent.print(); }
}
    }


