package JAVA_82.day07_Karsilastirma;

import java.util.Scanner;

public class C01_If_Haftaici_Haftasonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gün Girin:");

        String gun = scan.next().toUpperCase();


        if (gun.equals("CUMARTESİ") || gun.equals("PAZAR")) {
            System.out.println(" HAFTASONU");
        } else if (gun.equals("PAZARTESİ") || gun.equals("SALİ") || gun.equals("ÇARŞAMBA") ||
                gun.equals("PERŞEMBE") || gun.equals("CUMA")) {
            System.out.println(" HAFTAİÇİ");
        } else if (!(gun.equals("PAZARTESİ") || gun.equals("SALİ") || gun.equals("ÇARŞAMBA") ||
                gun.equals("PERŞEMBE") || gun.equals("CUMA")
                || gun.equals("CUMARTESİ") || gun.equals("PAZAR"))) {
            System.out.println(" DÜZGÜN BİR GÜN ADI GİRİNİZ");
        }


    }
}


