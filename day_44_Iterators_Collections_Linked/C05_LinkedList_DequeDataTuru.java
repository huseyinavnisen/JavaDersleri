package JAVA_82.day_44_Iterators_Collections_Linked;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList<>();
        // deq iki taraflı çalışır. kuyruğun her iki tarafı
        // her methodundan iki adesi vardır. Baştan - sonda.
        // offerfirst ()  ve offerlast() gibi...
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeFirstOccurrence("Selim");
        System.out.println(ll4); // [Cavidan, Mesut, Tevfik, Selim] - 12. satırı en son ekledim
        String pop=ll4.pop(); // ilk elemanı siler ve bize döndürür
        System.out.println(pop); // Cavidan



        ll4.removeFirst();
        ll4.removeLast();
        System.out.println(ll4); // [Tevfik]

    }

}
