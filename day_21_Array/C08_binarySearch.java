package JAVA_82.day_21_Array;

import JAVA_82.day_14_Method_Cretaion.C03_Method_Creation;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search javada dizi içinde eleman aramanın kısa yoludur.
        ancak arama yapmadan önce SORT ile sırali haline getirilmeli yoksa hata olur veya bulamayabilir.
         */
        String[] harfler = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "A";

        System.out.println(Arrays.binarySearch(harfler, arananHarf));  // binary search bize İNT değer yani aranan elemanın imdexini döndürür.

        C03_Contains_Methodu.kontrol(harfler,arananHarf);

        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler, arananHarf));



    }

}
