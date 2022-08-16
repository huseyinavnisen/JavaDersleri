package JAVA_82.day03_scanner;

public class C02_Sayi_Degistir {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        System.out.println("Sayı 1: " + sayi1);
        System.out.println("Sayı 2: " + sayi2);
        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;

        System.out.println("Değişim Yapıldı ");


        System.out.println("Sayı 1: " + sayi1);
        System.out.println("Sayı 2: " + sayi2);
    }
}
