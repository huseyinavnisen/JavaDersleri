package JAVA_82.day08_If_Else;

import java.util.Scanner;

public class C02_IfStatement02 {
    public static void main(String[] args) {
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // 50-60 arasi "C",
        // 60-80 arasi "B",
        // 80’nin uzerinde ise "A"
        // geçersiz notta uyarı ver


        Scanner scan = new Scanner(System.in);

        System.out.print(" Notunuzu Girin  :");
        double not = scan.nextDouble();


        if (not >= 0 || not < 50) {
            System.out.println("D");

        }
        else if (not <= 60) {
            System.out.println("C");

        }

        else if (not <= 80) {

            System.out.println("B");
        }


        else if (not <= 100) {
            System.out.println("A");

        } else

        {
            System.out.println("Geçerli bir not giriniz");

        }
    }
}
