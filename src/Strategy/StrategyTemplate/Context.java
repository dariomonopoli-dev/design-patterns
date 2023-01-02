package Strategy.StrategyTemplate;

public class Context {

        protected AbstractStrategy strategy;

        public Context(AbstractStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(AbstractStrategy strategy) {
            this.strategy = strategy;
        }

        public void performSomething() {
            strategy.doSomething();
        }
    }

