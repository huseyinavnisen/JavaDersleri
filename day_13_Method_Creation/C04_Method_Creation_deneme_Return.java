package JAVA_82.day_13_Method_Creation;

import java.util.Scanner;

public class C04_Method_Creation_deneme_Return {
    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        System.out.print("1.Sayı : ");
        double s1 = al.nextDouble();
        System.out.print("2.Sayı : ");
        double s2 = al.nextDouble();

        t(s1, s2);



    }


    public static double t(double a, double b) {
        double top=a+b;
        System.out.println("Sayıların Toplamı: " + top);
        return top;
    }

}




