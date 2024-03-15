import Interface.Interface;
import enums.DemoEnum;

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
//        TryCatch.tryCatch();
//        Recursion.recursion();
//        Vehicles.vehicles();
//        Interface.interfaces();
//        ConsoleCalculator.consoleCalculator();
//        AreaOfTriangle.areaOfTriangle();
//        CircleArea.circleArea();
//        PINumberFormatting.pINumberFormatting();
//        AdminGuestMode.adminGuestMode(new String[]{"asdasd asdssss sdsdsdsd --guest sdd qqqqq wwww --admin"});
//        AdminGuestMode.adminGuestMode(new String[]{"asdasd asdssss sdsdsdsd --guest sdd qqqqq wwww"});
//        AdminGuestMode.adminGuestMode(new String[]{"asdasd asdssss sdsdsdsd  sdd qqqqq wwww --admin"});
//        RandomNumber.randomNumber();
        DemoEnum.demoEnum();
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