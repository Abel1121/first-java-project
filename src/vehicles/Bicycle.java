package vehicles;

public class Bicycle extends Vehicle {

    @Override
    public void run() {
        System.out.println("vehicles.Bicycle runs slow because it's powered by legs");
    }

    public void ringBell() {
        System.out.println("Ring ring");
    }


}
