package JAVA_82.day_20_Array;

import java.util.Arrays;

public class C04_Dizi_Elemanlari_Yazdirma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]  arrayin kendisi

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+ " ");   // 1 2 3 4 5 6 7  // arrayin tüm elementleri
        }
    }
}
