package Java.Problem01;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String grade="";

        if(number >= 90){
            grade="A+";
        }else if(number >= 80 && number <=89){
            grade="A";
        }else if(number >= 70 && number <= 79){
            grade = "A-";
        }else if(number >= 60 && number <= 69){
            grade = "B";
        }else if(number >40 && number <= 59){
            grade = "C";
        }else{
            grade = "F";
        }

        System.out.println(grade);
    }
}
