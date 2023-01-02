package Flyweight.FlyweightTemplate;

public class ConcreteFlyweight implements Flyweight{


    String intrinsicState;

    public ConcreteFlyweight() {
        intrinsicState = "Some instrinsic State";
    }
    @Override
    public void operation(String exstrinsicState) {
        System.out.println(this.intrinsicState + " "+ exstrinsicState);

    }
}
