import java.util.Scanner;

public class Recursion {

    public static void recursion() {
        int[] numbers = {10, 11, 12, 13, 14, 15};

        getIndexAndShowValue(10, 12, 13, 14, 15);
        sout("KONIEC");
    }

    private static void getIndexAndShowValue(int ...numbers) {
        sout("Podaj numer indeksu: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int index = getIndexFromUser(scanner);
            sout("Podałeś indeks numer: " + index + " dla którego wartość z tablicy to: " + numbers[index]);
        } catch (Exception e) {
            sout("Wystąpił błąd! ", e.getMessage());
            getIndexAndShowValue(numbers);
        } finally {
            scanner.close();
        }
    }

    private static void sout(String text, String text2) {
        System.out.println(text + text2);
    }

    private static void sout(String text) {
        System.out.println(text);
    }
    private static int getIndexFromUser(Scanner scanner) {
        return scanner.nextInt();
    }
}
