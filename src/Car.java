public class Car extends Vehicle {
    Car () {}
    Car(String model) {
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
