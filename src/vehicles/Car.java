package vehicles;

public class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("vehicles.Car runs fast becouse it's powered by engine");
    }

    public Car() {}
    public Car(String model) {
        this.model = model;
    }

    public Integer km;
    private Integer topSpeed = 120;

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }
    public Integer getTopSpeed() {
        return topSpeed;
    }



    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo();
        System.out.println("KM: " + String.format("%,d", km));
    }
}
