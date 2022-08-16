package JAVA_82.day08_If_Else;

import java.util.Scanner;

public class C03_Nested_If_Else {

    public static void main(String[] args) {

/* emeklilik kontrolu yapan bir program yaziniz
cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
farkli bir harf veya sembol girilirse hata mesajı versin

emeklilik icin kadinlarda yas siniri 60
erkeklerde 65 olsun
negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */


        Scanner scan = new Scanner(System.in);

        System.out.print(" Yaşınızı Girin  :");

        double yas = scan.nextDouble();

        System.out.print(" Cinsiyetinizi Girin ( E / K )  :");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        if (cinsiyet == 'E') {

            if (yas < 0 || yas > 80) {

            }
        }


        {


        }
    }
}