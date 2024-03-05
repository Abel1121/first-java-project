public class ClassObject {

    ClassObject() {

    }

    ClassObject(String model) {
        this.model = model;
    }

    public String color;
    public String model;
    public Double price;
    public Double km;

    public void getCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + String.format("%.3f", price));
        System.out.println("KM: " + String.format("%.3f", km));
    }
}
