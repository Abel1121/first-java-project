import java.util.Scanner;

public class MathFormulasSwitch {

    public static void mathFormulasSwitch() {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.print("Podaj długość boku kwadratu aby wyliczyć jego objętność: ");
        System.out.print("Wybierz wzór: \n 1) Obwód kwadratu: \n 2) Obwód prostokąta: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        String chosenOptions = switch (option) {
            case 1, 6 -> {
                System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód: ");
                int sideLength = sc.nextInt();
                System.out.println("Obwód kwadatu to: "  + (4 * sideLength));
                yield "Wybrałeś opcję: " + option;
            }
            case 2 -> {
                System.out.print("Podaj długość boku A prostokąta aby wyliczyć jego obwód: ");
                int a = sc.nextInt();
                System.out.print("Podaj długość boku B prostokąta aby wyliczyć jego obwód: ");
                int b = sc.nextInt();
                System.out.println("Obwód prostokąta to: "  + (2 * a + 2 * b));
                yield "Wybrałeś opcję: " + option;
            }
            case 3 -> {
                System.out.print("Podaj długość boku A prostokąta aby wyliczyć jego pole: ");
                int a = sc.nextInt();
                System.out.print("Podaj długość boku B prostokąta aby wyliczyć jego pole: ");
                int b = sc.nextInt();
                System.out.println("Pole prostokąta to: "  + (a * b));
                yield "Wybrałeś opcję: " + option;

            }
            default -> {
                System.out.println("Nie ma takiej możliwości!!!");
                yield "Nie wybrałeś opcji";
            }
        };
        System.out.println("Wybrałeś opcje: " + chosenOptions);
    }
}
