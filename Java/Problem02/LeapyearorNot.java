package Java.Problem02;

import java.util.Scanner;

public class LeapyearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year.");
        }else{
            System.out.print("Not Leap Year.");
        }
    }
}
