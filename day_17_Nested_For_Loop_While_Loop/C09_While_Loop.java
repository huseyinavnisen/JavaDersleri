package JAVA_82.day_17_Nested_For_Loop_While_Loop;

import java.util.Scanner;

public class C09_While_Loop {
    public static void main(String[] args) {

/*Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve başarılı şifre girinceye kadar tekrar Şifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

        */

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;


        while (!sifreBasariliMi) {
            kontrol=0;

            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }

            if (kontrol == 4) {
                System.out.println("Şifre Başarı İle Tanımlandı");
                sifreBasariliMi = true;

            }

        } // while sonu


    }
}
