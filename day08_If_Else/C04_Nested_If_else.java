package JAVA_82.day08_If_Else;

import java.util.Scanner;

public class C04_Nested_If_else {
    public static void main(String[] args) {

                /*Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
            Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
            Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
            Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
                Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

                 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi >9999){
            System.out.println("Lütfen 4 Basmaklı Sayı Girin");
        } else if (sayi%5==0){

            if (sayi%10==0){
                System.out.println("5'e Bölünen Çift sayı");
            } else {
                System.out.println("5' e Bölünen Tek Sayı");
            }


        }else {
            System.out.println(" Tekrar Dene");
        }


    }
}
