package JAVA_82.day_22_multiDimensionalArrays;

public class C02_Mda_TumElementleriYazdirma {
    public static void main(String[] args) {
        // verlen bir MDA'nın tüm elemenlerini yazdıran bir method

        int sayilar[][] = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

        diziyazdir(sayilar);
int top=0;

    }

    public static void diziyazdir(int[][] sayilar) {
        int top=0;
        for (int i = 0; i < sayilar.length; i++) {  // i=0,1,2 değerini alır

            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + " ");
                top+=sayilar[i][j]; // tüm elemnaların toplamı

            }

        }
        System.out.println(top);
    }
}
