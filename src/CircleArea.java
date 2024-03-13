import java.util.Scanner;
import java.lang.Math;

public class CircleArea {

    public static void circleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter circle radius: ");

        double radius = Integer.parseInt(sc.nextLine());
        double circleArea = (Math.PI * (2 * radius));

        System.out.println("Circle circumference is: " + circleArea);
    }
}
