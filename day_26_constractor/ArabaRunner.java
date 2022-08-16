package JAVA_82.day_26_constractor;
import JAVA_82.day_25_constractor.Car; // ÖNEMLİ : başla paketten obje kullanabilmek için import yaptık
public class ArabaRunner {
    public static void main(String[] args) {
       Car car1 = new Car(); // başka bir paketten obje oluşturduk
        Araba araba1 = new Araba();// yeni obje oluşturduk. aynı packette
        System.out.println("Marka  :" + araba1.marka);
        System.out.println("Model :" + araba1.model); // Model :Model Belirtilmedi
        System.out.println("Fiyat  :" + araba1.fiyat);

        Araba araba2=new Araba("Renalut","Clio",2055,100);
        System.out.println(araba2.marka); // Renalut
        System.out.println(araba2.model); // Clio


        Araba araba3=new Araba("Opel","Corsa",1800,250000);
        System.out.println(araba3.fiyat); // 250000
        System.out.println(araba3.model);

        Araba araba4=new Araba();
        System.out.println("Araba 4 :" + araba4.model);

        Araba araba5=new Araba("Honda","Civiv",2018,150000);
        System.out.println("Model:"+ araba5.model);
        System.out.println("Fiyatı:" + araba5.fiyat);
        System.out.println("Marka :" + araba5.marka);
        System.out.println("Model Yılı:"+ araba5.modelYili);



    }
}
