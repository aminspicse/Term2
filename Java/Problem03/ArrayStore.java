package Java.Problem03;

import java.util.Scanner;

public class ArrayStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, sum=0;
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Printed array: ");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }
        System.out.println("Summation of Array: "+sum);
    }
}
