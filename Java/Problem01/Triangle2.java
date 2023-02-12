package Java.Problem01;

import java.util.Scanner;

/*
 * Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))
    where s = (a+b+c) / 3
 */
public class Triangle2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double s, area;

        System.out.println("Enter a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a+b+c)/3;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of Triangle: "+area);

    }
}
