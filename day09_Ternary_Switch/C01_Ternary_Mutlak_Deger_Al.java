package JAVA_82.day09_Ternary_Switch;

import java.util.Scanner;

public class C01_Ternary_Mutlak_Deger_Al {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");

        double sayi1 = scan.nextDouble();


        System.out.println(sayi1>= 0  ? sayi1:(-1 * sayi1));


    }
}
