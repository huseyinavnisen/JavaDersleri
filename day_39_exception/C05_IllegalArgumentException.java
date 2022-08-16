package JAVA_82.day_39_exception;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    /*
    soru: kulanıcıdan yasini girmesini isteyin
    yaşı negatif girerse exception versin

     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();

        try {
            if(yas<0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Yaşınız : " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz");

        }
        /*
        yasini giriniz
-36
java.lang.IllegalArgumentException
	at JAVA_82.day_39_exception.C05_IllegalArgumentException.main(C05_IllegalArgumentException.java:18)
Yas negatif olamaz

         */

        Thread.sleep(5000);
    }
}
