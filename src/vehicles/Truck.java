package vehicles;

public class Truck extends Vehicle {
    @Override
    public void run() {
        System.out.println("vehicles.Truck runs slow because it's huge");
    }

    public Truck() {}
    Truck(String model) {
        this.model = model;
    }
}
