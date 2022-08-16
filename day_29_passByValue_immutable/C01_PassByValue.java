package JAVA_82.day_29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elamanlı bie array oluşturalım
        ayrı bir method ile 0. ve 1. elemanlarını 100 den küçük bir sayı ile
        değiştirip yeni halini yazdırın method yapalım
         */
        int[] arr = {5, 7, 8, 10};

        elemanDegistir(arr);
        System.out.println("main method diğer method çalıştıktan sonra" + Arrays.toString(arr));

    }

    public static void elemanDegistir(int[] arr) {
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100); // 0 - 100 arası rasgele bir rakam
        arr[1] = rnd.nextInt(100);
        System.out.println("Method içindeki hali: " + Arrays.toString(arr));

    }


}
