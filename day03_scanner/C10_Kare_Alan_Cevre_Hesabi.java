package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C10_Kare_Alan_Cevre_Hesabi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Karenin Kenar Uzunluğunu Girin : ");
        double k= scan.nextDouble();
        System.out.println(" Karenin Alanı : "+ k*k);
        System.out.println(" Karenin Çevresi : "+ 4*k);
    }
}
