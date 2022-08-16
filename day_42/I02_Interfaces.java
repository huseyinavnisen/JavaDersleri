package JAVA_82.day_42;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    /*
    ınterface bir class değildir
    abstract claslar javada abstraction yani soyutlaştırma - kural koyma işlevini yapıyordu
    ancak; abstract bir clasta, abstract olmayan methodlarda olabilir.  böylr olunca tam
    yani full abstraction olmuş olmazdı.
    Eğer java da içinde hiç concrete method olmasın dediğimiz bir class oluşturmak istiyorsak
    bunu class DEĞİL interface yapmalıyız.

    ALTIN KURAL 1: INTERFACE'LERDE CONCRETE METHOD OLMAZ
    ALTIN KURAL 2:INTERFACE FULL ABSTRACTİON YAPTIĞINDAN OBJE OLUŞTURAMAZ
    ALTIN KURAL 3: CLASLARDA BİR CHİLD, SADECE 1 PARENTTE EXTENS OLABİLİRDİ. INTERFACE'DE İSE BİZ
    İSTEDİĞİMİZ KADAR PARENT CLASA bağlanabilir.
    ALTIN KURAL 4: INTERFACE NEYİN YAPILACAĞINI BELİRTİR, NASIL OLACAĞINA KARIŞMAZ
     */
List<String> liste=new ArrayList<>();
// List bir interfacedir. Bunun için  List'in child ı olan ArrayList'ten obje oluşturuyoruz.
}
