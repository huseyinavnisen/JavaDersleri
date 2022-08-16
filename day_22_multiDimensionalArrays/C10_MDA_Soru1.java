package JAVA_82.day_22_multiDimensionalArrays;

public class C10_MDA_Soru1 {

    /*
Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlari çarpan java

*/
    public static void main(String[] args) {
        int[][] sayilar = {{1, 2, 3}, {1, 5}, {1, 7}};
        int carpim = 1;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                carpim*=sayilar[i][j];
            }
        }
        System.out.println(carpim);
    }
}

