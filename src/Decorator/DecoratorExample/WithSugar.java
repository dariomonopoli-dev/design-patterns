package Decorator.DecoratorExample;

public class WithSugar extends CoffeDecorator{
    Coffee coffee;

    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + .25;
    }
}
