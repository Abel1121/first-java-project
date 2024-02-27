import java.util.Scanner;

public class MathFormulasIf {

    public static void mathFormulas() {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.print("Podaj długość boku kwadratu aby wyliczyć jego objętność: ");
        System.out.print("Wybierz wzór: \n 1) Obwód kwadratu: \n 2) Obwód prostokąta: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód: ");
            int sideLength = sc.nextInt();
            System.out.println("Obwód kwadatu to: "  + (4 * sideLength));
        } else if (option == 2) {
            System.out.print("Podaj długość boku A prostokąta aby wyliczyć jego obwód: ");
            int a = sc.nextInt();
            System.out.print("Podaj długość boku B prostokąta aby wyliczyć jego obwód: ");
            int b = sc.nextInt();
            System.out.println("Obwód prostokąta to: "  + (2 * a + 2 * b));
        } else {
            System.out.println("Nie ma takiej możliwości!!!");
        }
    }
}
