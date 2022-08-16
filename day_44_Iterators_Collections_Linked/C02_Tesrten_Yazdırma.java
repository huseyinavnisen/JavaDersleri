package JAVA_82.day_44_Iterators_Collections_Linked;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_Tesrten_Yazdırma {
    public static void main(String[] args) {
        /*
         Bir listi sondan başa yazın
        */
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println("Liste Başlangıç Hali : "+ liste); // Liste Başlangıç Hali : [2, 13, 56, 23, 45, 14, 40]

        ListIterator lit1= liste.listIterator();

        while (lit1.hasNext()){
            lit1.next();  // önce Iterator sona odaklandı
            }

        while (lit1.hasPrevious()){
            System.out.print(lit1.previous()+ "  "); // 40  14  45  23  56  13  2
        }


    }
}
