package Java.Problem01;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number; 
        System.out.println("Enter a Number: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.println("Positive.");
        }else if(number < 0){
            System.out.println("Negative.");
        }else{
            System.out.println("Number is Zero.");
        }
    }
}
