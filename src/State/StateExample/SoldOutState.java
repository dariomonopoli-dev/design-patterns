package State.StateExample;

public class SoldOutState implements State {
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
       }
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter"); }
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs"); }
    public void dispense() {
        System.out.println("You need to pay first"); }
}