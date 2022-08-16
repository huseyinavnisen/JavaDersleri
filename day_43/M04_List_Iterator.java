package JAVA_82.day_43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class M04_List_Iterator {
    public static void main(String[] args) {
        /*
        ListIteratöor; Iteratör'ün childi olsa da daha fazla method bulundurur
         */
        List<Integer> liste =new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Liste Başlangıç Hali : "+ liste); // [10, 20, 30]


        ListIterator lit1= liste.listIterator();


        int temp;

        while (lit1.hasNext()){
            temp=(Integer)lit1.next()+3;
            lit1.set(temp);
        }
        System.out.println("Liste Son Hali : "+ liste); // [13, 23, 33]
    }
}
