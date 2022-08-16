package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C08_Scanner_İlk_Harf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz :");

        String isim = scan.nextLine(); // Klavyeden girilen İsim bir string değişkene aktarılır
        String buyukisim = isim.toUpperCase(); // isim değişkenindeki string ifade büyük harfe çevrilir ve buyukisim değişkenine aktarılır.
        char birinciharf = buyukisim.charAt(0); // Büyük harfe çevrilen ismin birinci harfi alınır ve birinciharf char değişkenine aktarılır.
        char ucuncuharf=buyukisim.charAt(2);  // Büyük harfe çevrilen ismin üçüncü harfi alınır ve ucuncuharf char değişkenine aktarılır.

        System.out.println("İsminizin İlk Harfi :" + birinciharf);
        System.out.println("İsminizin Üçüncü Harfi :" + ucuncuharf);


    }
}
