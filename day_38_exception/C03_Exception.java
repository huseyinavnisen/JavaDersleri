package JAVA_82.day_38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        /*
        Marketteki tüm ürünleri bir arrayde tuttuğumuzu varsayalım.
        kullanıcıya index sorup, o indexteki ürünü yazdıran jav akodu
        ** Kullanıcı index saysından büyük b,ir sayı girerse Exception vermesin
                 */

        String urunler[] = {"Nutella", "Cokokrem", "Süt", "Çay", "Fındık"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Ürünün Sıra Nosunu Yazın");
        int istenenIndex=0;

        try {
            istenenIndex=scan.nextInt(); // sayı yerine string girerse çuvallar == >InputMismatchException
        } catch (InputMismatchException hataKodu) {
            // throw new RuntimeException(hataKodu); // bu değişkeni hata verince blgi göndermek için kulanırız
           //  System.out.println(hataKodu);
            System.out.println("Ürün indexi için Sayı girmelisiniz.");
        }
        try {
            System.out.println("Aradığınız Ürün " + urunler[istenenIndex-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ürün indexi en fazla :" + urunler.length + " olabilir");
        }
    }
}
