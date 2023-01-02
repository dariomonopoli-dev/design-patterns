package Command.CommandExample;

public class GarageInvoker {

    GarageReceiver g;

    public GarageInvoker() {}

    public void setGarage(GarageReceiver aGarageReceiver) {
        g = aGarageReceiver;
    }

    public void pressButton() {
        g.openDoor();
    }


}
