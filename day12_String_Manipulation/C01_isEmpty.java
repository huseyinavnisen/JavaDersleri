package JAVA_82.day12_String_Manipulation;

import java.util.Scanner;

public class C01_isEmpty {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        System.out.print(" Bir Cümle Giriniz  : " );


        String cumle=scan.nextLine();

        if (cumle.isEmpty()==true) {
            System.out.println(" Bir şeyler yaz ne olursun");
        }


    }
}
