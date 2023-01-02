package Strategy.StrategyExample;

public class MallardDuck extends Duck{


        public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
            super(flyBehaviour, quackBehaviour);
        }

        public void performFly() {
            flyBehaviour.fly();
        }
}
