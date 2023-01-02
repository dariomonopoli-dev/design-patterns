package Decorator.DecoratorExample;

public class DecoratorExampleMain {
    public static void main(String[] args) {

        Coffee espresso = new Espresso();

        printCoffee(espresso);

        espresso = new WithMilk(espresso);

        printCoffee(espresso);

        espresso = new WithSugar(espresso);

        printCoffee(espresso);

    }

    private static void printCoffee(Coffee c) {
        System.out.println("Cost: " + c.getCost() + ", Description: " + c.getDescription());
    }
}