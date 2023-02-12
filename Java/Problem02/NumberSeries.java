package Java.Problem02;

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Using For Loop: ");
        int sum=0;
        for(int i = 2; i <= n; i = i+2){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Summation: "+sum);

        System.out.println("Using While Loop: ");
        int i=2;
        while(i<=n){
            System.out.println(i);
            ///sum = sum+i;
            i = i+2;
        }
        System.out.println("Summation: "+sum);

        System.out.println("Using Do While: ");
        int j=2;
        do{
            System.out.println(j);
            //sum = sum+i;
            j = j+2;
        }while(j<=n);
        System.out.println("Summation: "+sum);

    }
}
