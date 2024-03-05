import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void tryCatch() {
        int[] numbers = {10, 11, 12, 13, 14, 15};

        System.out.println("Podaj numer indexu: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int index = scanner.nextInt();
            System.out.println("Podałeś index numer: " + index + " dla którego wartość z tablicy to: " + numbers[index]);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) { //InputMismatchException zbiera złe wartości z wpisanej przez nas zmiennej,a ArrayIndexOutOfBoundsException to error gdy podany niepoprawny index
            System.out.println("Niepoprawna wartość! " + e.getMessage());
        } catch (Exception e) { // Exception get all errors
            System.out.println("Wystąpił błąd! " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("KONIEC");
        }
    }
}
