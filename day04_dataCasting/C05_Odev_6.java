package JAVA_82.day04_dataCasting;

import java.util.Scanner;

public class C05_Odev_6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print(" İnteger Bir Değer Girin : ");
        int is= scan.nextInt();

        System.out.print(" Double Bir Değer Girin : ");
        double ds= scan.nextDouble();

        double s=(double)is/ds;

        System.out.println(" İnteger Değerin, Double Değere Bölüm Sonucu: "+s);
    }
}
