package JAVA_82.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

    /*
    1 - Lambda ( Functional Programing ) Java 8 ile kullanılmaya başlandı
    2 - Functional Programming te " NE YAPILACAK" ( What to do ) üzerine yoğunlaşılır.
        Structured Progrramming " Nasıl Yapılacak" ( How to do ) üzerine yoğunlaşır.
    3 - Functional Programming Arrays ve Collections ile Kullanılır.
    4 - MAP'ler ise entrySet( ) methodu ile  sete dönüştürülerek kullanılır.
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(6);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        //1) Ardışık list elementlerini aynı satırda aralarında boşluk
        // bırakarak yazdıran bir method oluşturun.(Structured)


        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        listCiftElemanlariniYazdirStructured(liste);
        System.out.println();
        listCiftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdirFunctional(liste);
        System.out.println();
        tekrarsizCiftelemlarinKareToplami(liste);
        System.out.println();
        gelecek(liste);

    }

    private static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));

        //stream( ) methodu collectiondan elemanları akışa dahil etmek için ve methodlara ulaşmak için kullanılır.
    }

    // Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listCiftElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list){
            if (w%2==0) System.out.print(w+ " ");
        }
    }

    // 2- Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listCiftElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t->t%2==0).forEach(t -> System.out.print(t + " "));
        System.out.println("***");
        list.stream().filter(t->t%2==0).filter(t->t%3==0).forEach(t -> System.out.print(t + " "));
    }

    // Ardışık tek list elementlerininın karesini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
      list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t -> System.out.print(t + " "));
    // elemanların değerleri değişiecekse map ( ) kullanılır

    }
    // Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdirFunctional(List<Integer> list) {
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t -> System.out.print(t + " "));

//   distinct() aynı olan elemanalrı bir daha bakmaz
    }



    //  5 - Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftelemlarinKareToplami(List<Integer> list) {
        int toplam =list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
        // reduce(0,(t,u)->t+u)  daraltma yapıyor. Yani tek değere çeviriyor.
    }

    //  6 - Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void gelecek(List<Integer> list) {
        int toplam =list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println(toplam);
        // reduce(0,(t,u)->t+u)
    }


}
