import java.util.Scanner;

public class ArraysMatrices {

    public static void arraysMatrices() {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int[][] numbersMatrix = {
                {10, 11, 12},
                {13, 14},
                {15, 16, 17},
                {18},
        };
//        int sumGlobal = 0;
//        for (int i = 0; i < numbersMatrix.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < numbersMatrix[i].length; j++) {
//                sum += numbersMatrix[i][j];
//                System.out.print(numbersMatrix[i][j] + " ");
//            }
//            sumGlobal += sum;
//            System.out.println(sumGlobal);
//        }

//        for (int[] numbersRow: numbersMatrix) {
//            for (int number : numbersRow) {
//                System.out.print(number + " ");
//            }
//            System.out.println();
//        }

        System.out.println("Podaj ilość poziomów: ");
        Scanner scanner = new Scanner(System.in);
        int levelCount = scanner.nextInt();

        for (int i = 0; i < levelCount; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 13) {
//                break; // stop for loop
//            }
//            System.out.println(numbers[i]);
//        };
//
//        System.out.println("Podaj dowolne słowo: ");
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.next();
//        for (char wordPart : word.toCharArray()) {
//            System.out.print(wordPart + " ");
//        }
    }
}
