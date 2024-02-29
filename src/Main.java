public class Main {
    public static void main(String[] args) {
//        loop();
//        variableTypes();
//        MathOperator.mathOperator();
//        MathFormulasIf.mathFormulas();
//        MathFormulasSwitch.mathFormulasSwitch();
//        OperationOnArray.operationOnArray();
//        DoWhile.doWhile();
//        ForLoop.forLoop();
        Car audi = new Car("Audi");
        audi.color = "red";
        audi.price = 23.000;
        audi.km = 1200;
        audi.getVehicleInfo();
        System.out.println("Top speed 1: " + audi.getTopSpeed());
        audi.setTopSpeed(150);
        System.out.println("Top speed: 2: " + audi.getTopSpeed());

        System.out.println("---------------------");

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.color = "blue";
        bmw.price = 15.000;
        bmw.km = 150;
        bmw.getVehicleInfo();

        System.out.println("---------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.model = "Składak";
        bicycle.color = "black";
        bicycle.price = 15.000;
        bicycle.getVehicleInfo();
        bicycle.ringBell();
    }
  
    private static void loop() {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    private static void variableTypes() {
        byte byteVar = 1;
        System.out.println("byte, range -128 to 127, size 1 byte: " + byteVar);

        short shortVar = 2;
        System.out.println("short range -32,768 to 32,767, size 2 byte: " + shortVar);

        int intVar = 3;
        System.out.println("int range -2,147mln to 2,147mln, size 4 byte: " + intVar);

        long longVar = 40000000L;
        System.out.println("long, size 8 byte: " + longVar);

        float floatVar = 400.12F;
        System.out.println("float, size 4 byte: " + floatVar);

        double doubleVar = 400.13D; // or 400.13
        System.out.println("double, size 8 byte: " + doubleVar);

        char charVar = 64; // change number from dec to char like 62 = @ or 125 = {
        System.out.println("char, range 0 to 65,536 size 2 byte: " + charVar);

        boolean booleanVar = true; // default value boolean is false
        System.out.println("boolean, range 0 to 65,536 size non precised: " + booleanVar);

        var varVariable = "asdasd"; // var type is like any in ts
        System.out.println("var: " + varVariable);
    }
}