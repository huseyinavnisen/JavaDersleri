package JAVA_82.day_45_Collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
       //  liste.add(5); atama yapılamaz
       //  liste.add('s'); atama yapılamaz
        // liste.add(true); atama yapılamaz

        List<Object> listObject =new ArrayList();
        listObject.add(5);
        listObject.add('s');
        listObject.add(true);
        listObject.add("Hasan");
        System.out.println(listObject); // [5, s, true, Hasan]

        listObject.set(0,(Integer)listObject.get(0)+7); // ilk integer elemana 7 ekle
        System.out.println(listObject); // [12, s, true, Hasan]

        listObject.set(3,listObject.get(3)+" Can");
        System.out.println(listObject);// [12, s, true, Hasan Can]

        /*
        Collections <dataTuru> nü Object seçersek her türlü data türü eklenebilir
        bu çok esnek bir yapıdır, ancak işlem yaprkan tüm elemanları; Object olarak
        tanımladığımızdan cok fazla Castingyapma zoeunluluğu ortaya çıkmaktadır.
         */
    }
}
