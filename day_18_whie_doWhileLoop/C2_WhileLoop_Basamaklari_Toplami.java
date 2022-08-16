package JAVA_82.day_18_whie_doWhileLoop;

public class C2_WhileLoop_Basamaklari_Toplami {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin


        int sayi = 5698;
        int raktop = 0;
        int temp = sayi;
        int basamak = 0;

        while (temp > 0) {
            basamak = temp % 10;
            raktop += basamak;
            temp /= 10;
        }
        System.out.println(sayi + " Sayısının Basmakları Toplamı: " + raktop);

    }
}
