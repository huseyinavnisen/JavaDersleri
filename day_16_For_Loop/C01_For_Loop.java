package JAVA_82.day_16_For_Loop;

import java.util.Scanner;

public class C01_For_Loop {
    public static void main(String[] args) {
        // verşlen pozitif tamsayının
        // tam bölenlerini yazdıralım

        Scanner al=new Scanner(System.in);
        System.out.print("Sayıyı Girin :");
        int sayi=al.nextInt();
        int top=0;



        for (int i=1;i<=sayi;i++) {

            if (sayi%i==0) {
                System.out.print(i + " ");

            }

        }


    }
}
