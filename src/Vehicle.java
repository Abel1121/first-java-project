public class Vehicle {
    public String color;
    public String model;
    public Double price;

    public void getVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + String.format("%.3f", price));
    }
}
