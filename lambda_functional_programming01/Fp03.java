package JAVA_82.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        // buyukHarfleYazdir1(liste);
        uzunlugaGoreYazdir(liste);

    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    // 1.YOL
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // 2.YOL
//    public static void buyukHarfleYazdir1(List<String> list) {
//        list.replaceAll(String::toUpperCase); // büyüğe çevirdi ve kalıcı olur
//        System.out.println(list);
//    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

}
