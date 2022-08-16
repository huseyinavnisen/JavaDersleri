package JAVA_82.day_30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Kenan");
        liste.add("Enes");
        liste.add("İsmail");

        System.out.println(liste); // [Kenan, Enes, İsmail]

        liste.set(1,"Yasemin");
        System.out.println(liste); // [Kenan, Yasemin, İsmail]

        liste.remove("İsmail");
        System.out.println(liste); // [Kenan, Yasemin]
    }
}
