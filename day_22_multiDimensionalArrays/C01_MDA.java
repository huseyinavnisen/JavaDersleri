package JAVA_82.day_22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        /*
        tek katli arraylari direk yazdırmayız ama içindeki elemanları direk yazdırırız.
        MDA'lerde en dikkat etmemiz gereken konu, ulaşmak istediğimiz element bir array mi
        yoksa primitive data mı bunu iyi seçmeliyiz

         */
        int[][] sayilar = {{1, 2, 4,5}, {3, 4}};
        // iç içe iki dizi

        System.out.println(sayilar[0]);  // [I@19dfb72a referans

        System.out.println(Arrays.toString(sayilar[0]));  // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2 == indexi 0 olan ilk dizinin 1.indexli elemanı
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@19dfb72a, [I@17c68925]   [I@17c6345] iki ref

        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]  == deepToString komutu

        // diziyi 2 şekilde deklare edebiliriz.
        // 1 - elemanları direk içine yazarak oluşturabilriz. int[][] sayilar = {{1, 2, 4,5}, {3, 4}};
        // 2 - iç ve dış dizi uzunluklarını belirtirerek oluşturabiliriz. int dizi [][]=new int [3] [2]
        // ANCAAAK 2. yöntemde iç dizilerin farklı uzunlukta olamaz. Eleman sayıları aynı olmalıdır.





    }
}
