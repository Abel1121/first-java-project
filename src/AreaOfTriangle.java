import java.util.Scanner;

public class AreaOfTriangle {
    public static void areaOfTriangle() { //heron formula
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
        int A = Integer.parseInt(sc.nextLine());

        System.out.print("Please, enter B side of a triangle: ");
        int B = Integer.parseInt(sc.nextLine());

        System.out.print("Please, enter C side of a triangle: ");
        int C = Integer.parseInt(sc.nextLine());

        double p = (double) (A + B + C) / 2;
        double triangleArea = Math.sqrt(p * (p - A) * (p - B) * (p - C));

        System.out.println("Triangle area is: " + triangleArea);
    }
}
