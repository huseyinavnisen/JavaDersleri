package JAVA_82.day_23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]

        /*

        List ile gelen sort methodunda sıralama özelliğini girmek gerekiyor.
        bunun yerine Collections class dan sort methodunu kullanıyoruz.
        bu method listemizi naturel ordera göre sıralar.
         */

    }
}
