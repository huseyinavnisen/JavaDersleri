package JAVA_82.day_22_multiDimensionalArrays;

public class C04_MDA_Soru {

    /*
Asagidaki multi dimensional array’in ic array’lerindeki
son elemanlarin carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
 */
    public static void main(String[] args) {
        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6,1}};
        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (j == sayilar[i].length - 1) {
                    carpim *= sayilar[i][j];
                }
            }
        }
        System.out.println("Son elemanların Çarpımı : " + carpim);
    }
}

