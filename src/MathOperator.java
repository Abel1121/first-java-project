public class MathOperator {

    public static void mathOperator() {

        // Dwuargumentowe operatory arytmetyczne (+, -, /, %, *)

        int i1 = 30;
        int i2 = 10;
        int i3 = 4;
        int i4 = 3;

        System.out.println("i1 + i2 = " + (i1 + i2)); // 40
        System.out.println("i1 - i2 = " + (i1 - i2)); // 20
        System.out.println("i1 / i2 = " + (i1 / i2)); // 3
        System.out.println("i3 % i4 = " + (i3 % i4)); // 1 modulo
        System.out.println("i3 * i4 = " + (i3 * i4)); // 12
        System.out.println();
        System.out.println("Hello " + "World" + "!");
        System.out.println("--------------------------------");


        // Jednoargumentowe operatory logiczne (++, --)

        int i5 = 10;
        int i6 = -10;

        System.out.println("i5 = " + i5); // 10
        //Postinkrementacja
        System.out.println("i5++ = " + i5++); // 10
        System.out.println("i5 = " + i5); // 11
        //Preinkrementacja
        System.out.println("++i5 = " + ++i5); // 12
        System.out.println("i5 = " + i5); // 12
        System.out.println();
        System.out.println("i6 = " + i6); // -10

        //Postinkrementacja
        System.out.println("i6-- = " + i6--); // -10
        System.out.println("i6 = " + i6); // -11
        //Preinkrementacja
        System.out.println("--i6 =" + --i6); // -12
        System.out.println("i6 =" + i6); // -12
        System.out.println("--------------"); // -12

        //Operatory przypisania

        int i7 = 10;
        int i8 = 10;
        i7 += 5;
        i8 -= 5;

        System.out.println("i7 = " + i7); // 15
        System.out.println("i8 = " + i8); // 5
        System.out.println("-----------------");

        //Operatory relacyjne (==, !=, >, <, >=, <=)

        int i9 = 10;
        int i10 = 20;

        System.out.println("i8 == i9" + (i9 == i10)); // false;
        System.out.println("i8 != i9" + (i9 != i10)); // true
        System.out.println("i8 > i9" + (i9 > i10)); // false
        System.out.println("i8 < i9" + (i9 < i10)); // true
        System.out.println("i8 >= i9" + (i9 >= i10)); // false
        System.out.println("i8 <= i9" + (i9 <= i10)); // true
        System.out.println("---------------------------");

    }
}
