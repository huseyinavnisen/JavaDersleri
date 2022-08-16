package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C09_İki_Sayi_Gir_İslem_Yap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz :");
        double s1 = scan.nextDouble();
        System.out.print("2.Sayıyı Giriniz :");
        double s2 = scan.nextDouble();

        System.out.println("Sayıların Toplamı :" + (s1+s2));
        System.out.println("Sayıların Farkı :" + (s1-s2));
        System.out.println("Sayıların Çarpımı :" + (s1*s2));
        System.out.println("Sayıların Bölümü :" + (s1/s2));

    }
}
