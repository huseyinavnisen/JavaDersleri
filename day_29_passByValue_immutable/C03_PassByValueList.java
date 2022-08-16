package JAVA_82.day_29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValueList {
    public static void main(String[] args) {
        /*
        bir list oluşturun, iki ayrı method yapın
        ilk methodda sadece elemanları değiştirin
        ikinci methodda yeni bir list oluşturup aynı sayıda yeni eleman ekleyin
         */
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("Main Methodtaki List : " + list); // ali, veli can
        elemanDegistir(list);
        System.out.println("Eleman Değiştir Methodu sonrası : " + list); // oguz murat fatih

        listDegistir(list);
        System.out.println("List Değiştir Methodu Sonrası :" + list);
    }
    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Fındık");
        System.out.println("List Değiştir Methodu İçinde :" + list);
    }
    public static void elemanDegistir(List<String> list) {
        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("Eleman Değiştir Methodu içi " + list);
    }
}
