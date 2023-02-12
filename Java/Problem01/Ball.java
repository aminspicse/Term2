package Java.Problem01;

import java.util.Scanner;

public class Ball {
    public static void main(String[] arg) {
        final double PI = 3.1416;
        Scanner sc = new Scanner(System.in);
        int radius;
        double volume; 
        System.out.println("Enter Radius: ");
        radius = sc.nextInt();
        volume = (4/3)*PI*(radius*radius*radius);

        System.out.println("Volume: "+volume);

    }
}
