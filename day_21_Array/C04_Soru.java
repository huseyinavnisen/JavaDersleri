package JAVA_82.day_21_Array;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Soru {
    public static void main(String[] args) {

// Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array olusturup,
// bu array’i bize donduren bir method olusturun

        //  String[] isimler = {"Ahmet", "Hasan", "Ali", "Trabzonspor"};

        int[] sayilar = diziYap();


        System.out.println(Arrays.toString(sayilar));
    }
    private static int[] diziYap() {

        Scanner al = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Girin: ");
        int uzunluk = al.nextInt();
        int oluşturulan[] = new int[uzunluk];
        int sayi;
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Dizinin " + (i + 1) + ". Elamını Girin");
            oluşturulan[i] = al.nextInt();
        }
        return oluşturulan;
    }
}


