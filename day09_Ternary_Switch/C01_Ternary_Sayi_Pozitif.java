package JAVA_82.day09_Ternary_Switch;

import java.util.Scanner;

public class C01_Ternary_Sayi_Pozitif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");

        double sayi1 = scan.nextDouble();




        System.out.println(sayi1>= 0  ?" Sayı Pozitif ":(sayi1*sayi1));


    }
}
