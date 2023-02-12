package Java.Problem03;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salestarget, targetachived, totalattandance, attendance;
        double attpercent, targetpercent, bonus=0;

        System.out.println("Enter Target: ");
        salestarget = sc.nextInt();
        System.out.println("Enter Achived Target: ");
        targetachived = sc.nextInt();
        System.out.println("Enter Attandance: ");
        totalattandance = sc.nextInt();
        System.out.println("Enter Achived Attendance: ");
        attendance = sc.nextInt();

        //System.out.println(salestarget+" "+targetachived+" "+attendance+" "+totalattandance);


        if(targetachived >= (0.95*salestarget)  && attendance == totalattandance){
            bonus = 60;
        }else if(targetachived >= (0.95*salestarget)  && attendance >= (0.9*totalattandance)){
            bonus = 40;
        }else if(targetachived >= (0.8*salestarget)  && attendance == totalattandance){
            bonus = 40;
        }else if(targetachived >= (0.8*salestarget)  && attendance == (0.9*totalattandance)){
            bonus = 20;
        }else{
            bonus = 5;
        }

        System.out.println("Bonus = "+bonus+"%");

        

    }
}
