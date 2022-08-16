package JAVA_82.day_31_timeFormatter_varrags;

public class C03_Varrags_Ile_Toplama {
    // verilen kaç integer olursa olsun toplayıp sonucu yazdıran method oluşturun
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int s3 = 50;
        int s4 = 100;
        toplaYazdir(s1, s2, s3); // toplaYazdir(int... sayi) methoduna gider
        toplaYazdir(s1, s2); // toplaYazdir(int... sayi) methoduna gider
        toplaYazdir(s1, s2, s3, s4); // toplaYazdir(int... sayi) methoduna gider
    }

    public static void toplaYazdir(int... sayi) {
        /*
        int... sayi : bu gösterim integer variablelardan oluşan bir varags demektir
        varags ARRAY alt yapısını kullanır
         */
        int top = 0;
        int sayiAdet=sayi.length;
        for (int each : sayi) {
            top += each;
        }
        System.out.println(" Girilen "+ sayiAdet + " Sayının Toplamı :  "+ top);
    }

}

