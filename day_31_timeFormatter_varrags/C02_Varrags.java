package JAVA_82.day_31_timeFormatter_varrags;

public class C02_Varrags {
    public static void main(String[] args) {
        // verilen iki integeri toplayıp sonucu yazdıran method oluşturun
        int s1 = 10;
        int s2 = 20;
        int s3 = 30;
        int s4 = 40;
        int s5 = 50;
        //  sayitopla(s1, s2);
        sayitopla(s1, s2, s3, s4, s5);
        sayitopla(s1, s2);
        sayitopla(s1,s2,s3);
    }

    public static void sayitopla(int...sayi) {

    }


    // public static void sayitopla(int s1, int s2, int s3) {
    //    System.out.println("Verilen Üç Sayının Toplam :" + (s1 + s2 + s3));
    //  }

    // public static void sayitopla(int s1, int s2) {
    // System.out.println("Verilen İki Sayının Toplam :" + (s1 + s2));
    // }
}
