package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains_gmail_varmi {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email=scan.nextLine();
        if (!email.contains("@gmail.com")){
            System.out.println("lutfen Geçerli gmail adresi giriniz");
        } else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazmınızı kontol edin");
        }









    }


}

