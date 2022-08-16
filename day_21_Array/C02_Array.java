package JAVA_82.day_21_Array;

public class C02_Array {
    public static void main(String[] args) {

// Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String dizi[] = {"Ahmet", "Hasan", "Ali", "Trabzonspor"};
        enUzunEnKisa(dizi);

    }

    public static void enUzunEnKisa(String[] dizi) {
        String enuzunkelime = dizi[0];
        String enkisakelime = dizi[0];
        for (int i = 1; i < dizi.length; i++) {

            if (dizi[i].length() > enuzunkelime.length()) {
                enuzunkelime=dizi[i];
            }

            if (dizi[i].length() <enkisakelime.length()) {
                enkisakelime=dizi[i];
            }
        }
        System.out.println("Kısa Kelime : " + enkisakelime);
        System.out.println("Uzun Kelime : " + enuzunkelime);

    }



}
