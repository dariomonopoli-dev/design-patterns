package Adapter.AdapterTemplate;

public class Client {
    public static  void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new AdapteeAdapter(adaptee);
        target.request();
    }
}
