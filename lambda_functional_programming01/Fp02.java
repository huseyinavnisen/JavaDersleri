package JAVA_82.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1) t-> "Logic" ;  (t,u ) -> "Logic"  bu yapıya Lambda Expession denir.
    2) Functional Programming kapsamında  Lambda Expession kullanılır ama önerilmez
    Lambda Expession yerine "Method Refferance" tercih edilir.
    3) "Method Refferance" kullanımı ==> Class Name :: Method name

    Aynı zamanda kendi claslarınızı da kullanabilirsiniz.
    Örneğin bir Animal Clasınız var ve bu class ta "eat()" methoduna sahip olsun.
    ==> Animal::eat   şeklinde kullanılır.
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

        ListelemanlariniYazdirFunctional(liste);

        System.out.println();
        ciftElemanlariYazdirFunctional(liste);

        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);

        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdirFunctional(liste);

        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);

        System.out.println();
        tekrarsizCiftelemlarinKupCarpimi(liste);

        System.out.println();
        getMaxEleman(liste);

        System.out.println();
        YedidenBuyukCiftMin(liste);

        System.out.println();
        getTersSiralaTekrarsizElemanlarinYarisi(liste);

    }

    // 1) Ardışık list elemanlarını aynı satırda aralarında boşluk
// bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void ListelemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında
    //boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::CiftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // /3) Ardışık tek list elemanlarının karelerini
// aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::TekElemaniSec).map(Utils::KareAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //     // Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
    //     boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdirFunctional(List<Integer> list){
        list.stream().distinct().filter(Utils::TekElemaniSec).map(Utils::KupAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }


    //   5 - Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        int top1 =list.stream().distinct().filter(Utils::CiftElemaniSec).map(Utils::KareAl).reduce(Math::addExact).get();
        int top2 =list.stream().distinct().filter(Utils::CiftElemaniSec).map(Utils::KareAl).reduce(0,Math::addExact);
        int top3 =list.stream().distinct().filter(Utils::CiftElemaniSec).map(Utils::KareAl).reduce(0,Integer::sum);
        System.out.println(top1);
        System.out.println(top2);
        System.out.println(top2);
    }

    //  6 - Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftelemlarinKupCarpimi(List<Integer> list) {
        int carpim = list.stream().distinct().filter(Utils::CiftElemaniSec).map(Utils::KupAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list) {
        int max = list.stream().distinct().reduce(Math::max).get();
        System.out.println("En Büyük Eleman : " + max);
    }
//Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void YedidenBuyukCiftMin(List<Integer>liste){
        int sayi=liste.stream().distinct().filter(t->t>7).filter(Utils::CiftElemaniSec).reduce(Math::min).get();
        System.out.println(sayi);
    }
        // Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
        // yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTersSiralaTekrarsizElemanlarinYarisi(List<Integer>liste){
        List<Double>sonuc= liste.stream().distinct().filter(t->t>5).map(Utils::YarisiniAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }

}