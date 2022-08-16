package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her clasda görünmesede bir constractor vardır.
    bu clastan obje oluşturmak istediğimizde default cons devreye girer

    default constr gözlemyleemecepğimiz için onun yerine
    kullanılabilecek parametresiz const oluşturalım
     */
protected String grandpaKlupAdi="Grandpa Kulübü";

    AGrandParent(){ // Constractor oluşturuldu
        System.out.println("AGrandParent Constractor Çalıştı");
    }
}

