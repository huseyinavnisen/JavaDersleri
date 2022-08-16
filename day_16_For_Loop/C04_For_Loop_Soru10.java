package JAVA_82.day_16_For_Loop;

import java.util.Scanner;

public class C04_For_Loop_Soru10 {

    public static void main(String[] args) {


         // kullanıcı iki sayı giriyor. bu ikisi arasındaki sayıları toplayıp ekrana
         // yazdıram method.
        Scanner scan=new Scanner(System.in);
        System.out.print("Başlangıç Değerini giriniz: ");
        int bas=scan.nextInt();
        System.out.print("Bitiş Değerini giriniz: ");
        int bitis=scan.nextInt();

        aralarıtopla(bas,bitis);

    }

    public static void aralarıtopla(int bas, int bitis) {

       int top=0;

        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                top+=i;
            }
        } else {

            for (int i = bitis; i <= bas; i++) {
                top += i;
            }

        }
        System.out.println("Toplam : " + top);

    }
}

