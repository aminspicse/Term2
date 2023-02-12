package Java.Problem01;

import java.util.Scanner;

public class Circle {
    public static void main(String[] arg) {
        final double PI = 3.1416;
        Scanner sc = new Scanner(System.in);
        double radius, area;

        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();

        area = PI*(radius*radius);

        System.out.println("Area of Circle: "+area);

    }
}
