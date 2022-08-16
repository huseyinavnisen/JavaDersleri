package JAVA_82.day_36_inheritanceDataTypeKullanimi;

public class EYanhizmetler extends  BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("İşçiler: " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetler %30 indirimli ozel sigorta yaptirabilir");

   BMuhasebe yh1=new EYanhizmetler();
        System.out.println(yh1.gunlukMesai); // variable olduğu için Muhasebeden alır ==8
        System.out.println(yh1.saatUcreti); // variable olduğu için Muhasebeden alır ==10
        yh1.maas(); // Method olduğu için muhasebeye gider. maas() bulur. Bakar. Override varmı bakar. YanHizmetlerden alır. 30x9x8= 2.160
        yh1.ozelSigorta(); // Muhasebeden bulur.
        yh1.sigorta(); // Personel
        System.out.println(yh1.isim); //
        System.out.println(yh1.soyisim); //
        System.out.println(yh1.departmant);//
       //  System.out.println(yh1.issizlikSigorta); aramaya BMuhasebe den başlayacağı için orada bulamaz yukarıya doğru da bulamaz. CTE verir


    }

}
