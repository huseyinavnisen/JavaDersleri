package JAVA_82.day_22_multiDimensionalArrays;

public class C03_MDA_Istenen_Elemani_Yazdirma {

    /*
Verilen 2 katli bir multi-dimensional array'de
outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
[0][0] + [1][1] + [2][2] ......

 */

    public static void main(String[] args) {
        int[][] sayilar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1,6},{1,2,6,8}};
        int top = 0;
        for (int i = 0; i < sayilar.length; i++) {  // 0 - 1 - 2 ye döner
            for (int j = 0; j < sayilar[i].length; j++) {  // i=0 için j =0 1 2 3 4  **  i=1 için j = 0 1 2 3 ** i=2 için j =0 1 2
                if (i == j) {
                    top += sayilar[i][j];
                    System.out.println("["+i+"].["+j+"] Elementi = " + sayilar[i] [j]);
                }
            }
        }
        System.out.println("Toplam :" + top);
    }

}
