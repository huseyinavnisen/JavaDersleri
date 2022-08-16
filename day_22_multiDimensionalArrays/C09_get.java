package JAVA_82.day_22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);

        List<String> isimler=new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Hakan");
        isimler.add("Fatma");

        System.out.println( isimler.get(2) ); // Fatma

        System.out.println(sayilar.get(1)); // 3


    }
}
