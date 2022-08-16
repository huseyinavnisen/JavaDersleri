package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adınızı Girin : ");
        String ad = scan.nextLine();

        System.out.print("Soyadınızı Girin : ");
        String soyad = scan.nextLine();

        System.out.print(" Yaşınızı Girin:");
        double yas=scan.nextDouble();

        System.out.println(ad + " " + soyad + "  " + yas + " yaşındasınız");

    }
}
