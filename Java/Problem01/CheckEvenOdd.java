package Java.Problem01;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter Number: ");
        number = sc.nextInt();

        if(number%2 == 0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }

        
    }
}
