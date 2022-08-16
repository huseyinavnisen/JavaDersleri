package JAVA_82.day_36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci  extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci(){
        System.out.println("İşçiler: " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Memurlar %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        // bir obje oluşruulukne Data türüve Constractor aynı clastan ise
        // direk o clasa gidiyorduk.
        // Eğer data türü ve cons farklı ise;
        // obje Constractorin olduğu clas'in objesidir. Ancak bizden istenen
        // Isci clasındakşi spesiifik özellikler değil
        // bir işçnini muhasebe clasındaki tüm çalışanlar
        // ile beraber sahip olduğu genel özellikleri yazdırır.


        System.out.println(isc1.gunlukMesai); // Muahsebeden alır ==8
        System.out.println(isc1.saatUcreti); //Muhasebeden alır ==10
        isc1.maas(); // Muhasebeden maaş hesaplar
        isc1.ozelSigorta(); // Muhasebeden hesaplar
        isc1.sigorta(); // Personel
        System.out.println(isc1.isim); // Personel
        System.out.println(isc1.soyisim); // Personel
        System.out.println(isc1.departmant);//Personel

        APersonel isc2=new DIsci();
       //  System.out.println(isc2.gunlukMesai); CTE
        // System.out.println(isc2.saatUcreti); CTE
        isc2.maas(); // Muhasebeden maaş hesaplar
       //  isc2.ozelSigorta(); CTE
        isc2.sigorta(); // Personel
        System.out.println(isc2.isim); // Personel
        System.out.println(isc2.soyisim); // Personel
        System.out.println(isc2.departmant);//Personel

 // eğer adata türü olan clasta aradığımız özellik yok ise onun parentine gider
 // ama childe dönemez. dolayısı ile aradığı veriyi bulamadığı için
 // CTE verir.

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();


        // merve kimisi için kız, kimisi için bacı, kimisi için haladır.

    }
}
