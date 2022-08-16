package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class HCorolla extends GToyota {
    HCorolla() {
        System.out.println("HCorolla Parametresiz Constractor");
    }

    HCorolla(String isim) {
        super(isim); // parametreli cons yazdım
        System.out.println("HCorolla Parametreli Constractor");
    }
}