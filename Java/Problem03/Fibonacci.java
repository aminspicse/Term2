package Java.Problem03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n=sc.nextInt();

        Fibonacci fi = new Fibonacci();

        for(int i=0; i<n; i++){
            System.out.println(fi.fibo(i));
        }
        
    }

    public int fibo(int n){

        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return (fibo(n-1) + fibo(n-2));   
    }
}
