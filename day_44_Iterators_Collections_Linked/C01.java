package JAVA_82.day_44_Iterators_Collections_Linked;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01 {
    public static void main(String[] args) {
        /*
         Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                          (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
 Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
 output: [23,40]
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
            Integer temp=(Integer) lit1.next(); // Obje - İnteger kıyaslanamaz - dönüştürdük
            if (temp<20 || temp>40) { // next() bir defa gördümü ilerler
                lit1.remove();
            }
        }
        System.out.println("Liste Son Hali : "+ liste); // Liste Son Hali : [23, 40]
    }
}
