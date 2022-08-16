package JAVA_82.day_22_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_MDA_Soru6 {

    /*
Soru 6: verilen bir arrayde istenen değere eşit olan elemanları kaldırıp, kalanları yeni bir array olarak yazdırın

*/
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        int[] dizi = {1, 4, 3, 4, 5, 6, 1, 8, 9, 12, 1, 14};
        System.out.println(Arrays.toString(dizi));  // [1, 4, 3, 4, 5, 6, 1, 8, 9, 12, 1, 14]

        System.out.print("Dizide Silmek İstediğiniz Sayıyı Girin :");
        int silinecek = al.nextInt();
        int siladet = 0;

        for (int i = 0; i < dizi.length; i++) {  // önce dizide silinecek elemeandan kaç tane olduğunu buldum
            if (silinecek == dizi[i]) siladet++;
        }
        int yenidizi[] = new int[dizi.length - siladet];  // yeni dizinin eleman sayısı; ilk dizide silinecek elemanın toplamı kadar eksik oluşturuldu.



        int yenidiziind = 0; // yeni dizinin indeksini kontol etmek için değişken

        for (int i = 0; i < dizi.length; i++) {
            if (silinecek != dizi[i]) {    // silinecek element dizinin[i]. elemanına eşit değilse
                yenidizi[yenidiziind] = dizi[i];   // eski dizideki o eleman yeni diziye aktarıldı
                yenidiziind++;  // yeni dizinin indeski 1 artırıldı.
            }
        }
        System.out.println(Arrays.toString(yenidizi));
    }
}

