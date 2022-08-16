package JAVA_82.day_22_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA_Soru {

    /*
Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini  birer birer bulan
ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz

 Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
 */

    public static void main(String[] args) {
        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeni = new int[sayilar.length];
        int top=0;
        int sayac = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                top+=sayilar[i][j];
            }
            yeni[i]=top;
            top = 0;
        }
        System.out.println("Yeni Dizi :"+ Arrays.toString(yeni));
    }

}

