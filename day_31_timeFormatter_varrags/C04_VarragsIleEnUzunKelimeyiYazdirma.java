package JAVA_82.day_31_timeFormatter_varrags;

public class C04_VarragsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali", "Veli", "Trabzon","Çekoslavakyalı");

        enUzunKelimeyiYazdir1(5,"Ali", "Veli", "Trabzon","Çekoslavakyalı"); // Varags var ise sında tanımlanmalı
            // bir defa varags kullanılabilğr

    }

    private static void enUzunKelimeyiYazdir1(int i, String ...kelime) {
    }


    public static void enUzunKelimeyiYazdir(String... kelime) {
        String enUzunKelime = kelime[0];
        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) enUzunKelime = each;
        }
        System.out.println("En Uzun Kelime  :" + enUzunKelime);
    }
}
