package JAVA_82.day_17_Nested_For_Loop_While_Loop;

import java.util.Scanner;

public class C08_While_Loop {
    public static void main(String[] args) {

/*
kullanıcıdan toplanmak üzere sayılar alın. toplamı 500 ü geçince sayı isemekten vazgeçin
kaç sayı girildiğini aşağıdaki gibi yazdırın
13 sayı girdiniz ve toplamları 567
 */
        Scanner al=new Scanner(System.in);

       int sayi=0;
       int top=0;
       int adet=0;

        while (top < 500) {
            System.out.print("Sayı Girin: ");
            sayi=al.nextInt();
            top+=sayi;
            adet++;
        }
        System.out.println(adet + " Sayı Girdiniz. Toplamı :" + top);
    }



}
