package Java.Problem01;
/*
 * 
 * Find area of triangle;
 */

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, height;
        double area;
        System.out.print("Enter Base: ");
        base = sc.nextInt();
        System.out.print("Enter Base: ");
        height = sc.nextInt();

        area = 0.5*base*height;

        System.out.println("Area: "+area);

    }
    
}
