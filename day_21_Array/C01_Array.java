package JAVA_82.day_21_Array;

public class C01_Array {
    public static void main(String[] args) {

// bir dizideki maximu sayıyı bulup yazdıran method oluşturun.

        int dizi[] = {15, 1, 2, 3};
        maxSayiyiYaz(dizi);
    }

    public static void maxSayiyiYaz(int[] dizi) {

        int enb = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];
            }
        }
        System.out.println(enb);
    }

}
