package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C11_Prizma_Alan_Hesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Prizmanın Yüksekliğini Girin : ");
        double h=scan.nextDouble();

        System.out.print("Prizmanın Uzun Kenarını Girin : ");
        double uk=scan.nextDouble();

        System.out.print("Prizmanın Kısa Kenarını Girin : ");
        double kk=scan.nextDouble();


        System.out.println(" Pirizmanın Hacmi  : "+ (h*uk*kk));

    }
}
