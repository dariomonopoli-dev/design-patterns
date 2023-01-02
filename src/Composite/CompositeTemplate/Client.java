package Composite.CompositeTemplate;


public class Client {
    public static void main(String[] args) {

        Component component1 = new Composite("Component 1");
        Component component2 = new Composite("Component 2");
        Component component3 = new Composite("Component 3");
        Component allComponents = new Composite("All Components");

        allComponents.add(component1);
        allComponents.add(component2);
        allComponents.add(component3);
        component2.add(new Leaf("Leaf 1"));
        component2.add(new Leaf("Leaf 2"));

        allComponents.operation();
    }
}