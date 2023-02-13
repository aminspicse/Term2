package Java.Problem03;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, flag=1;
        System.out.print("Enter Number: ");
        number = sc.nextInt();

        for(int i=2; i< number; i++){
            if(number%i == 0){
                flag = 0;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Prime.");
        }else{
            System.out.println("Not Prime.");
        }
        
    }
}
