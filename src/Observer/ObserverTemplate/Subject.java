package Observer.ObserverTemplate;

public interface Subject {
    void update(Observer observer);
    void remove(Observer observer);
    void notifyObservers();

}
