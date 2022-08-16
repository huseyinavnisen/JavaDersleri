package JAVA_82.day06_concatenation;

import java.util.Scanner;

public class C01_Wrapper_Clases {
    public static void main(String[] args) {

        // primitive data türlerini kullanmak için kullanılır.

        Scanner scan=new Scanner(System.in);





        System.out.println("5 Basmaklı Şifre Giriniz : ");

        String sifre=scan.nextLine();

     Integer sifresayı=Integer.parseInt(sifre); // stringi İnteger değere çevirir


        System.out.println(" Girilen Şifre : " + sifre + 3 +6);
      System.out.println(" İnteger Şifre : " + (sifresayı +  3));





    }
}
