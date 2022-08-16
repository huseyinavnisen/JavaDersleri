package JAVA_82.day_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);  // [5, 3, 2, 1]

        sayilar1.remove(1); // // 1. indexi sildi

        System.out.println(sayilar1);  // [5, 2, 1]

        // sayılardan oluşan bir list varsa reomeve methodunda sayı yazarsak bunu index kabul eder.
        // bunun önüne geçmek için remove yapılacak elementi bir variable atarız ve remove yazarız

        Integer sil=5;
        sayilar1.remove(sil); // 5'i silelim. İndexi değil direk nesneyi silmek için...

        System.out.println(sayilar1); // [2, 1]

         // veya indexof tan yararlanalım.









    }
}

