package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" 1.Sayıyı Girin:");
        int sayi1=scan.nextInt();

        System.out.print(" 2.Sayıyı Girin:");
        int sayi2=scan.nextInt();


        System.out.print(" Sayıların Çarpımı:" + sayi1*sayi2);

    }

}
