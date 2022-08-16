package JAVA_82.day09_Ternary_Switch;

import java.util.Scanner;

public class C04_Nested_Ternary_Harf_Gir {
    public static void main(String[] args) {


        // Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf”
        // buyuk harfse consola “Buyuk Harf” yoksa
        // “girdiginiz karakter harf degil” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        char harf=scan.next().charAt(0);

       //  String sonuc=(harf>='a' && harf<='z') ? ("Küçük Harf"):("Büyük Harf veya Geçersiz Harf");

        String sonuc=(harf>='a' && harf<='z') ? ("Küçük Harf"):  ((harf>='A' && harf <='Z') ? "Büyük Harf " : "Geçersiz Karakter");
        String sonuc1=harf>='a' && harf<='z' ? "Küçük Harf":  harf>='A' && harf <='Z' ? "Büyük Harf " : "Geçersiz Karakter";

        System.out.println(sonuc);

    }
}
