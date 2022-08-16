package JAVA_82.day_22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C05_Array_List {
    public static void main(String[] args) {

        // array list <> diamond işareti kullanılır.


        List<String> isimler = new ArrayList<>(); // bu şekilde yazlılır
        List<String> isimler1 = new ArrayList<String>(); // bu şekilde deolur ikinci Stringi yazmasanda olur.

        System.out.println(isimler);

        // elemen ekleme

        isimler.add("Ankara"); // geriye true veya false döndürür.
        isimler.add("Trabzon");
        System.out.println(isimler); // [Ankara, Trabzon]
    }
}
