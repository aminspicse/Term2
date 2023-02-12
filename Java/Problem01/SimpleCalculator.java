package Java.Problem01;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Operator: ");
        char op;
        op = sc.next().charAt(0);
        int a, b;
        double result=0;
        System.out.print("Enter a, b: ");

        a = sc.nextInt();
        b = sc.nextInt();

        if(op == '+'){
            result = a+b;
        }else if(op == '-'){
            result = a-b;
        }else if(op == '*'){
            result = a*b;
        }else if(op == '/'){
            result = a/b;
        }else if(op == '%'){
            result = a%b;
        }
        
        System.out.print("Result: "+result);

    }
}
