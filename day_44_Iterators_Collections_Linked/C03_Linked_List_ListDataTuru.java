package JAVA_82.day_44_Iterators_Collections_Linked;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Linked_List_ListDataTuru {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList(); // tüm LinkedListlerdeki methodları kullanabiliriz
        List<String> ll2=new LinkedList();// sadece list özellikleri ağır basan olan methodları kullanırız
        Queue<String> ll3=new LinkedList(); // sadece queue tipi ağır basan olan methodları kullanırız
        Deque<String> ll4=new LinkedList<>();// sadece Deque tipi ağır basan .......

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]sou
        System.out.println(ll2.remove(3)); // Sildiği indexteki kişiyi döndürür ==> Ayse
        System.out.println(ll2.remove("Kemal")); // Bu obje yok ==> False
        System.out.println(ll2.isEmpty()); // Boş değil ==> false
        System.out.println(ll2.set(0,"Kabinkara"));
        System.out.println(ll2); // [Kabinkara, Done, Enes]

       ll1.add("Done");
       ll1.add("Ismail");

       ll2.retainAll(ll1); // ll2 deki tüm elemanları ll1 ile karşılaştırır. ll1'de olmayanları siler ( kesişim )
        System.out.println(ll2);

        System.out.println(ll2.hashCode()); // 2136001
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 133867063





    }
}
