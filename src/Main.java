//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        variableTypes();
        //MathFormulasIf.mathFormulas();
        //MathFormulasSwitch.mathFormulasSwitch();
        ArraysMatrices.arraysMatrices();
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