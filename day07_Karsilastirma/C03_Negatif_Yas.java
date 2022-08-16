package JAVA_82.day07_Karsilastirma;

import java.util.Scanner;

public class C03_Negatif_Yas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı Girin: ");
        int yas = scan.nextInt();

        if (yas < 0) System.out.println("Geçerli Bir Yaş girin");
        else if (yas >=65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli Olamazsın ");

    }


}
