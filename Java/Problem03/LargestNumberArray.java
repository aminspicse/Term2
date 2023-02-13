package Java.Problem03;

import java.util.Scanner;

public class LargestNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, largest=-999999999;
        System.out.print("Enter Size: ");
        size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("Largest: "+largest);
    }
}
