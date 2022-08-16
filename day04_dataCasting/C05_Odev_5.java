package JAVA_82.day04_dataCasting;

import java.util.Scanner;

public class C05_Odev_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("İnteger 1.Değeri Girin : ");
        int s1 = scan.nextInt();

        System.out.print("İnteger 2.Değeri Girin : ");
        int s2 = scan.nextInt();

        double b=(double)s1/s2;
        System.out.println("Bölme Sonucu : " + b);

    }
}
