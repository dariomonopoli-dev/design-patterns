package Observer.ObserverTemplate;

public class Client {
        public static void main(String[] args) {

            ConcreteSubject topic = new ConcreteSubject();

            Observer observer1 = new ConcreteObserver();
            Observer observer2 = new ConcreteObserver();

            topic.setState("New State");

            topic.update(observer1);

            topic.notifyObservers();

            topic.remove(observer1);

            topic.update(observer2);

            topic.setState("Another new State"); //notifyObservers is automatically triggered


            //topic.remove(observer1); //throws an exception since we already removed it before


        }
    }

