package JAVA_82.day_15_Overloading_For_Loop;

public class C01_Return_Method {
    public static void main(String[] args) {
        // iki sayısı çarp ve sonucu döndür

        int s1 = 10;
        int s2 = 5;
        int sonuc = 0;

        System.out.println(sonuc);
        sonuc = carp(s1, s2);
        System.out.println(sonuc);
        System.out.println("İstanbul");

    }
    public static int carp(int s1, int s2) {

        System.out.println("Merhaba");
        return s1 * s2;
    }
}
    /* Konsol Çıktısı

         0
        Merhaba
        50
        İstanbul

    */