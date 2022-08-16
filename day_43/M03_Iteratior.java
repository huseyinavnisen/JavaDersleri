package JAVA_82.day_43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iteratior {
    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        // soru : liste'ki tüm elemnları INDEX KULLANMADAN 3 arttirin

        for ( Integer each:liste) {
            System.out.print(each+3+ " "); // 13 23 33
        }
        System.out.println(liste); // [10, 20, 30] yine eskiye döndü. YAPAMAYIZ
        /*
        JAVA index yapısı olmayan Collectionslardaki elemanlara
        ulaşmak veya değiştitrmek için ITERATOR Interfaceini oluşturmuştur
         */

         // ıteratire interface old için obje üretmeyiz
        // bunun yerine iteratör döndüren liste.iterator() kullanılır
        // date clasında olduğu gibi. now metodu vardı. Hatırla oni...
        Iterator it1= liste.iterator(); // sağda iterator obje var; sağda veriable. new olmaz bazen

        System.out.println(it1.next()); // 10;   10'un sağına gelir ve bize 10'u döndürür
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
       //  System.out.println(it1.next()); // EXCEPTİON VERİR. TAŞAR. RTE verir
        // şu aşamada iteratörde geri dönüş yoktur. Eğer başa dönmek için
        // yeni bir iteraötör oluşturmak gerekir.

        Iterator it2= liste.iterator();// şu an it2 listeki 10'un solunda
        it2.next();
        it2.remove();
        System.out.println(liste); //[20, 30]
        it2.next();
        it2.remove();
        System.out.println(liste); // [30]
        it2.next();
        it2.remove();
        System.out.println(liste); // []

        List<Integer> liste1 =new ArrayList<>();
        liste1.add(1);
        liste1.add(5);
        liste1.add(33);

        Iterator it3= liste1.iterator();
        System.out.println(liste1); // [1, 5, 33]
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println(liste1); // []

        // ıterator ile işler sınırlı maalesef. remove ve next var sadece
    }
}
