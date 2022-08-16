package JAVA_82.day_28_statickBlock;

public class C03_PassByValue {

    public static void main(String[] args) {

        // %25 inidirmli fiyatı hesaplayan bir method oluşturun
        double satisFiyati = 100;

        double indirimliFiyat= indirimbul(satisFiyati);
        System.out.println("İndirimli Fiyat :" + indirimliFiyat);


    }
    private static double indirimbul(double satisFiyati) {

        double indirimliFiyat=satisFiyati * 0.75;

        return indirimliFiyat;
    }
}
