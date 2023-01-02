package Adapter.AdapterTemplate;

public class AdapteeAdapter implements Target{

    private Adaptee adaptee;

    public AdapteeAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;

    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
