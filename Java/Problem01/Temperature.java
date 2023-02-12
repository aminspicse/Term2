package Java.Problem01;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        double celcius, farenhight;
        System.out.println("Enter Celcius: ");
        celcius = sc.nextDouble();
        farenhight = ((celcius*9)/5)+32;

        System.out.println("Farenheit: "+farenhight);
    }
}
