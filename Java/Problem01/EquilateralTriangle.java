package Java.Problem01;

import java.util.Scanner;
/*
 * Find the area of a equilateral triangle: (√3 / 4) * arm^2
 */
public class EquilateralTriangle {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int arm;
        double area;
        arm = sc.nextInt();

        area = (Math.sqrt(3)/4)*(arm*arm);

        System.out.println("Area of a equilateral triangle: "+area);
    }
}
