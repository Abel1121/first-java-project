public class ForLoop {
    public static void forLoop() {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int numbersLength = numbers.length;
        //int index = 0;

        for (int index = 0, index2 = 10; index < numbersLength; index++, index2--) {
            System.out.println(numbers[index]);
            System.out.println(index++);
            System.out.println(index--);
        }

        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
