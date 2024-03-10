package vehicles;

public class Vehicles {
    public static void vehicles() {
        Car audi = new Car("Audi");
        audi.color = "red";
        audi.price = 23.000;
        audi.km = 1200;
        audi.getVehicleInfo();
        System.out.println("Top speed 1: " + audi.getTopSpeed());
        audi.setTopSpeed(150);
        System.out.println("Top speed: 2: " + audi.getTopSpeed());
        audi.run();

        System.out.println("---------------------");

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.color = "blue";
        bmw.price = 15.000;
        bmw.km = 150;
        bmw.getVehicleInfo();
        bmw.run();

        System.out.println("---------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.model = "Składak";
        bicycle.color = "black";
        bicycle.price = 15.000;
        bicycle.getVehicleInfo();
        bicycle.ringBell();
        bicycle.run();

        System.out.println("---------------------");

        Truck truck = new Truck();
        truck.run();
    }
}
