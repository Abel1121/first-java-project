import java.util.ArrayList;
import java.util.Arrays;

public class OperationOnArray {
    public static void operationOnArray() {
        int[] array1;

        int[] array2 = new int[10]; // array length 10
        String[] array3 = {"5", "6", "7"}; // string array length 3
        double[] array4 = new double[]{6,5,7}; // double array length 3

        System.out.println(array4[0]);
        System.out.println(array4[2]);
        System.out.println(array3[0]);
        System.out.println(array3[2]);

        Arrays.sort(array4);

        System.out.println(Arrays.toString(array3));

        int[][] array6 = new int[5][5];
        System.out.println(Arrays.deepToString(array6));

        int[][] array7 = {
                {1,2,3},
                {2,3,4},
        };
        System.out.println(array7[1][2]);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        System.out.println(arrayList1.get(1)); // get position at index 1 from arrayList

        arrayList1.remove(2); // remove value at index 2 from arrayList

        System.out.println(arrayList1.get(2)); // get new value at position index 2



    }
}
