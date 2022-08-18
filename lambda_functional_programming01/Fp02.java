package JAVA_82.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

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
    public static void tekrarsizCiftelemlarinKareToplami(List<Integer> list) {
        list.stream().distinct().filter(Utils::CiftElemaniSec).map(Utils::KareAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }


}