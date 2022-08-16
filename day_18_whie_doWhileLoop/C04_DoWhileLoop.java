package JAVA_82.day_18_whie_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan sayı al. Çift girerse yazdır. tek girer ise bitir


        Scanner al = new Scanner(System.in);
        int sayi = 0;

        // while loop
        // while-Loop ta değeri döngüden önce atayacağız ANCAK bu değeri iyi düşünmeliyiz.


        while (sayi % 2 == 0) {
            System.out.println("Sayı Girin: ");
            sayi = al.nextInt();
            if (sayi%2==0) System.out.println("Girilen Sayı Çift " + sayi);
        }


        // do while ile yapalım
        // önceden oluşturula değişkenin önemi yok. her türlü çalışır.
        // ANCAK döngü içinde yanlış bir işlem yapılmaması lazım.


        do{
            System.out.println("Sayı Girin: ");
            sayi = al.nextInt();
            if (sayi%2==0) System.out.println("Girilen Sayı Çift " + sayi);

        } while (sayi%2==0);
    }
}
