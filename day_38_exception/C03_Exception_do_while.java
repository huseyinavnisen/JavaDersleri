package JAVA_82.day_38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception_do_while {
    public static void main(String[] args) {
        /*
        Marketteki tüm ürünleri bir arrayde tuttuğumuzu varsayalım.
        kullanıcıya index sorup, o indexteki ürünü yazdıran jav akodu
        ** Kullanıcı index saysından büyük b,ir sayı girerse Exception vermesin
                 */

        String urunler[] = {"Nutella", "Cokokrem", "Süt", "Çay", "Fındık"};
        Scanner scan = new Scanner(System.in);
        int istenenIndex = 0;
        String hataKodu = "";
        do {
            hataKodu = "";
            System.out.print("Ürünün İndex Nosunu Girin: ");
            try {
                istenenIndex = scan.nextInt();
            } catch (InputMismatchException e) {
                hataKodu += e;
                System.out.println("Ürünün İndexi İçin Sayı Girmelisiniz.");
                scan.nextLine(); // String girdiğimizde sonsuz döngüyü kırmak için yazdım
                istenenIndex = 0; // sayı girmediğimizde 33. satırdaki uyarıyı yazmasın diye istyenenIndex=0 atadım.
            }
            if (istenenIndex > urunler.length)
                System.out.println("Ürünün indexi en fazla :" + urunler.length + " olabilir");
        } while (istenenIndex > urunler.length || hataKodu.equals("java.util.InputMismatchException"));

        System.out.println("Aradığınız Ürün : " + urunler[istenenIndex-1]);
    }
}