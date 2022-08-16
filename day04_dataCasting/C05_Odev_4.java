package JAVA_82.day04_dataCasting;

import java.util.Scanner;

public class C05_Odev_4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print(" Double Bir değer Girin :");
        double s= scan.nextDouble();

        int is=(int)s;
        System.out.println("Double " + s + " değerinin İnteger Narrowing Sonucu : "+ is);

        byte bs=(byte)is;
        System.out.println(bs + " değerinin Byte Narrowing Sonucu : "+ bs);
    }
}
