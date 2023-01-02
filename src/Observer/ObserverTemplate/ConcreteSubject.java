package Observer.ObserverTemplate;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observers;
    private String state;

    public ConcreteSubject() {

        this.observers = new ArrayList<>();
    }

    @Override
    public void update(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int index = observers.indexOf(observer);
        if (index == -1)  {
            throw new NoSuchElementException("This Observer is not subscribed!");
        }
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return this.state;
    }
}

