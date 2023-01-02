package Adapter.AdapterExample;

public class AdapterExampleMain {

    public static void main(String[] args) {

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
    }
}
