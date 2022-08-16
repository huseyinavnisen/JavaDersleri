package JAVA_82.day09_Ternary_Switch;

import java.util.Scanner;

public class C03_Ternary_Ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi sıfır veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin.
        // Bunu Ternary ile yapamayız...ÖNEMLİ - Çoklu işlem var...


        System.out.print("Lütfen bir sayı giriniz: ");


        double sayi1 = scan.nextDouble();

        if (sayi1 > 0) {
            System.out.println(sayi1);

        } else {
            System.out.print("Lütfen İkinci Bir sayı giriniz: ");  // Bu kod lar ternary ile yazılamaz
            double sayi2 = scan.nextDouble();                       // Ternary tek işlem yapar.
            System.out.println(sayi1 * sayi2);
        }

    }
}
