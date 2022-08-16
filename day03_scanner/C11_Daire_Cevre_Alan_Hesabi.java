package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C11_Daire_Cevre_Alan_Hesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Girin : ");
        double r=scan.nextDouble();
        System.out.println(" Dairenin Alanı   : "+ (3.14*r*r));
        System.out.println(" Dairenin Çevresi : "+ 6.18*r);
    }
}
