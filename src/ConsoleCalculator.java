import java.util.Scanner;

public class ConsoleCalculator {
    public static void consoleCalculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int i1 = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int i2 = Integer.parseInt(scan.nextLine());

        System.out.println("Suma liczb to: " + (i1 +i2));
    }
}
