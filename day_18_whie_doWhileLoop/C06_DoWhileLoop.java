package JAVA_82.day_18_whie_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        //    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve
        //    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner al = new Scanner(System.in);
        int nsAdeti = 0;
        int sayi = 0;
        int psAdeti = 0;
        int pstTop = 0;

        do {
            System.out.print("Lütfen Toplamak Üzere Pozitif Tamsayı Girin : ");
            sayi = al.nextInt();
            if (sayi > 0) {
                psAdeti++;
                pstTop += sayi;
            } else if (sayi < 0) {

                System.out.println("Negatif Sayı Girmezsin");
                nsAdeti++;
            }

        } while (sayi != 0);

        System.out.println("Pozitif Sayı Adeti : " + psAdeti + "  Toplamları : " + pstTop);
        System.out.println("Nefatif Sayı Adeti : " + nsAdeti);
    }
}
