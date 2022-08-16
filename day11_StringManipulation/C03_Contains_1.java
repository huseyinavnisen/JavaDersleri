package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.


        String cumle = "Java buyük, DUNYA kücuk";


        if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());


        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());


        }
        else System.out.println("  Cümle küçük veya büyük harf içermiyor");


    }


}

