package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C06_endsWith_gmail_sorgu {
    public static void main(String[] args) {


                    //  Kullanicidan email adresini girmesini isteyin,
                   //    mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
                  //   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
                 //  @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println(" Mail adresini Girin : ");
        String mail=scan.nextLine();

        if (!mail.contains("@gmail.com")) {
            System.out.println(" Geçerli Mail Adresi Gir");
        } else if (mail.endsWith("@gmail.com")){
            System.out.println(" Doğru Mail adresi girdin");
        } else {
            System.out.println(" Lütfen Yazımı Kontol edin");
        }

    }


}

