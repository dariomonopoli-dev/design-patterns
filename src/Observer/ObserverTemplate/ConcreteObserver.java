package Observer.ObserverTemplate;

public class ConcreteObserver implements Observer{

    @Override
    public void update(String state) {
        System.out.println("Observer says: " + state);
    }

}
