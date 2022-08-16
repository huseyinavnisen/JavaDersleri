package JAVA_82.day10_String_Manipulation;

import java.util.Scanner;

public class C01_charAt {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String str="Java öğrenmek ne güzel";

        System.out.println(str.charAt(0)); // İlk harfi döndürür = J

        System.out.println(str.toUpperCase().charAt(4));  // R

        System.out.println(str.charAt(21)); // l  - son harf ( 22 harf -1 = 21)

        // System.out.println(str.charAt(22)); // hata verir - Java expection

        // charAt() kullandığımızda sonuç Karakter olduğu için String metodlarında kullandığımız
        // manipulationları kullanamayız. Dolayısı ile charAt() kullanacak isek en sonda kullanmalıyız.

    }
}
