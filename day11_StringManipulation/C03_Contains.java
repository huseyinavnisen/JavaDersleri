package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Mailini Gir : ");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println(" Lütfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println(" E mail kaydedildi");

        } else {
            System.out.println(" Kontrol et");

        }




    }


}

