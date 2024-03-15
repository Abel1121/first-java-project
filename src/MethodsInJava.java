import java.util.Scanner;

public class MethodsInJava {

    public static void AmountOfWords(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

        String words = sc.nextLine();
        int amountOfWords = getWordsAmount(words);

        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    public static int getWordsAmount(String text) {
        return text.split(" ").length;
    }


}
