package JAVA_82.day_44_Iterators_Collections_Linked;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListe_QueueDataTuru {
    public static void main(String[] args) {

        // Queue kuyruk demektir. Sıra önemli. Gelen sona gelir
        // giden baştan gider
        // eklerken baştan, alacağımız zaman baştan gibi
        Queue<String> ll3 = new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]
        ll3.remove();
        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]
        ll3.remove("Hpolat"); // Hpolat silecek== True döndürür
        System.out.println(ll3);// [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep - ilk eleman
        System.out.println(ll3.peek()); // Zeynep - döndürdü ama ... anlamadım
        System.out.println(ll3); // [Zeynep, Kadir]

        System.out.println(ll3.poll()); // zeynep döndürdü ama listten sildi
        System.out.println(ll3); // [Kadir]

        ll3.offer("Hasan"); // add gibi eler
        ll3.offer("Dayı");
        System.out.println(ll3); // [Kadir, Hasan, Dayı]


    }
}
