package JAVA_82.day_22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_addAll {
    public static void main(String[] args) {


        List<Integer> sayilar1=new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);

        List<Integer> sayilar3=new ArrayList<>();
        sayilar3.add(1000);
        sayilar3.add(1500);


        sayilar1.addAll(sayilar2);  // sayilar1 listine sayılar2 listini ekledi
        System.out.println(sayilar1); // [5, 3, 2, 10, 15, 16, 20]



        sayilar1.addAll(3,sayilar3);  // sayilar1 ( [5, 3, 2, 10, 15, 16, 20] ) 3.indexten sonra sayılar3 ü ekledi
        System.out.println(sayilar1);  // [5, 3, 2, 1000, 1500, 10, 15, 16, 20]






    }
}
