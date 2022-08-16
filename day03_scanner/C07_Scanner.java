package JAVA_82.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Adınızı, Soyadınızı ve Yaşınızı Girin.\nAralarda ENTER tuşuna basın ");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas= scan.nextInt();

        System.out.println(isim + "  "+ soyisim + " "+ yas);
    }
}
