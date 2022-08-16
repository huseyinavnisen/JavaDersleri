package JAVA_82.day_14_Method_Cretaion;

public class C03_Method_Creation {

    public static void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // İlk harfi büyük geriye kalan tüm harfleri * olacak şekilde
        // H******* Ş** şeklinde yazdıran bir method oluşturun

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim); // E*** B****

    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+ " "+soyisim);

    }
}
