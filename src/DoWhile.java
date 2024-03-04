public class DoWhile {
    public static void doWhile() {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int numberLength = numbers.length;
        int index = 0;

//        while (index < numberLength) { // first check condition them do loop
//            System.out.println(numbers[index]);
//            index++;
//        }

        do { // first do loop and them check condition
            System.out.println(numbers[index]);
            index++;
        } while(index < numberLength);
    }
}
