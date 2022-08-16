package JAVA_82.day08_If_Else;

import java.util.Scanner;

public class C05_Nested_If {


    public static void main(String[] args) {

                /*
 Kullanicidan bir sifre girmesini isteyin

 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
            Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
            Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

     */


        // İlk Harf Büyükmü
        // İlk Harf A veya z mi ?

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz : ");
        String sifre = scan.nextLine();
        char ilkharf = sifre.charAt(0);
        if (ilkharf >= 'A' && ilkharf <= 'Z') { // ilk harfi büuük olan kelimeler
            if (ilkharf == 'A') {
                System.out.println("Geçerli şifre");
            } else {
                System.out.println("Geçersiz şifre");
            }
        } else if (ilkharf >= 'a' && ilkharf <= 'z') { // ilk harf küçük olan kelimeler
            if (ilkharf == 'z') {
                System.out.println("Geçerli şifre");
            } else {
                System.out.println("Geçersiz şifre");
            }
        } else {
            System.out.println("Lütfen ilk karakter için sadece harf kullanın");
        }


    }

}




