package JAVA_82.day_21_Array;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {


        // 5- Verilen bir array’e yeni bir element ekleyen Method yapın

        String[] sinifListesi = {"zzzz", "zzzz", "Ali", "Trabzonspor"};
        Scanner al = new Scanner(System.in);
        System.out.println("Diziye Eklemek İstediğiniz Kelimeyi Girin : ");
        String eklencekIsım = al.nextLine();

        sinifListesi = diziyeEkle(sinifListesi, eklencekIsım);
        System.out.println(Arrays.toString(sinifListesi));
        Arrays.sort(sinifListesi);
        System.out.println(Arrays.toString(sinifListesi));

    }

    private static String[] diziyeEkle(String[] sinifListesi, String eklencekIsım) {
        String[] yeniSinifListesi = new String[sinifListesi.length + 1]; // [ null, null ]

        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }
        yeniSinifListesi[yeniSinifListesi.length - 1] = eklencekIsım;

        return yeniSinifListesi;
    }

}



