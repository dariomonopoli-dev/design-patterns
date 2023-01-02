package Composite.CompositeExample;

public class MenuLeaf extends MenuComponent{
    String name;
    boolean vegetarian;
    double price;

    public MenuLeaf(String name, boolean vegetarian, double price) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", cost: " + getPrice());
    }
}
