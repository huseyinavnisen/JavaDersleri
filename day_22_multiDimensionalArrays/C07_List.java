package JAVA_82.day_22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

         //List<int> sayilar=new ArrayList<>(); // primitive List olmaz
        List<Integer> sayilar=new ArrayList<>(); // wrapper clas yani Integer tip te olmali

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(7);
        System.out.println(sayilar); // [5, 12, 7]

        sayilar.add(3,100);
        System.out.println(sayilar);  // [5, 12, 100, 7]

        // add(index.element) istediğimiz elementi
    }
}
