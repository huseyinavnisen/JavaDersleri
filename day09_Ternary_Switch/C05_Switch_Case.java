package JAVA_82.day09_Ternary_Switch;

import java.util.Scanner;

public class C05_Switch_Case {
    public static void main(String[] args) {

        // gün numarasını alıp;
        // 1 - Pazartesi
        // ......
        // 7 - Pazar

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kaçıncı Gün Olduğunu Giriniz : ");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli Değer Girin");
                break;

        }


    }
}
