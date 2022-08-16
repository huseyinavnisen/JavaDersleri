package JAVA_82.day07_Karsilastirma;

import java.util.Scanner;

import static Soru_Bankasi.Orta_Seviye.Method_Cumleyi_Tersten_Yazma.tersyaz;

public class C01_If {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir Sayı Girin:");

        int  sayi1= scan.nextInt();

        if (sayi1>0) System.out.println(" Pozitif");



        if (sayi1%2==0) {

            System.out.println("Sayi Çift"); }

        else{

                System.out.println("Sayı Tek");
            }


        System.out.println(tersyaz("Ankara"));

        }


    }


