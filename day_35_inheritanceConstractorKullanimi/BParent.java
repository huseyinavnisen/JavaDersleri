package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class BParent extends AGrandParent {
    protected String isim="Parent ismi belirtilmedi";
    protected String parentKlupAdi="Parent Kulübü";

    BParent(){   // Constractor oluşturuldu
        System.out.println("Parent Constractor Çalıştı");
    }
}

