package JAVA_82.day_14_Method_Cretaion;

public class C04_Method_Creation_Return {
    public static void main(String[] args) {

        // verilen isim ve soyismi ilk harfi büyük
        // geriye kalanları * olacak şekilde değiştirip
        // bize bu halini döndüren bir Method oluşturun.
        // Not : Programın ilerleyen kısımlarında
        // İsim ve Soyismi bu yeni hali ile kullanmak istiyoruz.

        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);

        System.out.println(isim + " " + soyisim ); // Enes Bozkurt
        System.out.println(gizliIsim); //E*** B******


    }

    private static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
        return isim + " "+soyisim;
    }
}
