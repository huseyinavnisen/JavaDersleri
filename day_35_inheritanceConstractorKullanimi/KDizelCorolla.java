package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla() {
        System.out.println("KDizelCorolla Parametresiz Constractor");
    }

    KDizelCorolla(String isim) {
        super(isim); // parametreli cons yazdım
        System.out.println("KDizelCorolla Parametreli Constractor");
    }

    public static void main(String[] args) {
       // KDizelCorolla obj1=new KDizelCorolla(); // parametresiz
        // Gtoyota Parametresiz Constractor
        //HCorolla Parametresiz Constractor
        //KDizelCorolla Parametresiz Constractor

       KDizelCorolla obj2=new KDizelCorolla("Araba"); // parametreli
        //Gtoyota Parametreli Constractor
        //HCorolla Parametreli Constractor
        //KDizelCorolla Parametreli Constractor

    }
}