public class Car extends Vehicle {
    Car () {}
    Car(String model) {
        this.model = model;
    }

    public Integer km;

    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo();
        System.out.println("KM: " + String.format("%,d", km));
    }
}
