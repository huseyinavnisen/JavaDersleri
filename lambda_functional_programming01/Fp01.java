package JAVA_82.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        liste.add(8);
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
        tekrarsizCiftelemlarinKupCarpimi(liste);
        System.out.println();
        getMaxEleman(liste);
        System.out.println();
        getMaxEleman02(liste);
        System.out.println();
        getYedidenBuyukCiftMin(liste);
        System.out.println();
        getMinEleman(liste);
        System.out.println();
        getYedidenBuyukCiftMin02(liste);
        System.out.println();
        getYedidenBuyukCiftMin3(liste);
        System.out.println();
        getTersSiralaTekrarsizElemanlarinYarisi(liste);

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
        for (Integer w : list) {
            if (w % 2 == 0) System.out.print(w + " ");
        }
    }

    // 2- Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listCiftElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
        System.out.println("***");
        list.stream().filter(t -> t % 2 == 0).filter(t -> t % 3 == 0).forEach(t -> System.out.print(t + " "));
    }

    // Ardışık tek list elementlerininın karesini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        // elemanların değerleri değişiecekse map ( ) kullanılır

    }
    // Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdirFunctional(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

//   distinct() aynı olan elemanalrı bir daha bakmaz
    }


    //  5 - Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftelemlarinKareToplami(List<Integer> list) {
        int toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
        // reduce(0,(t,u)->t+u)  daraltma yapıyor. Yani tek değere çeviriyor.
    }

    //  6 - Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftelemlarinKupCarpimi(List<Integer> list) {
        int carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        // 1 başlangıç değerş t içindir, u soldn gelecek
        System.out.println(carpim);

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
// 1.  yol
    public static void getMaxEleman(List<Integer> list) {
        int max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        //int max1 = list.stream().distinct().reduce(list.get(0), (t, u) -> t > u ? t : u);
        // System.out.println("En Büyük Eleman : " + max1);
        System.out.println("En Büyük Eleman : " + max);

        // System.out.println(list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u));
    }

    // 2.yol
    public static void getMaxEleman02(List<Integer> list) {
        int max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("En Büyük Eleman : " + max);
    }
// ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void getMinEleman(List<Integer> list) {
        int min = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("En Küçük Eleman : " + min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukCiftMin(List<Integer> list) {
        int max = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce((t, u) -> t < u ? t : u).get();
        System.out.println("YedidenBuyukCiftMin = " + max);
    }

    // 2.yol
    public static void getYedidenBuyukCiftMin02(List<Integer> list) {
        int max = list.stream().distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("YedidenBuyukCiftMin02 = " + max);
    }

    // 3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer> list) {
        int sayi = list.stream().filter(t -> t % 2 == 0).filter(t -> t > 7).sorted().findFirst().get();
        System.out.println("YedidenBuyukCiftMin03 = " + sayi);
    }
// 10 -  Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
// yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralaTekrarsizElemanlarinYarisi(List<Integer> list) {
         List<Double>sonuc= list.stream().distinct().filter(t -> t > 5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);

    }

}


