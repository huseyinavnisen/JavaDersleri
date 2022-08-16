package JAVA_82.day04_dataCasting;

import java.util.Scanner;

public class C05_Odev_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir İnteger Sayı Girin : ");
        int s = scan.nextInt();

        short ss = (short) s;
        System.out.println("Girdiğin İnteger Sayının Short Olarak Narrowing Sonucu :" + ss);

        byte bs = (byte) s;
        System.out.println("Girdiğin İnteger Sayının Byte Olarak Narrowing Sonucu :" + bs);


    }
}
