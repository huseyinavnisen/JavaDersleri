package JAVA_82.day_21_Array;

import java.util.Scanner;

public class C03_Contains_Methodu {
    public static void main(String[] args) {

// Soru 2- Verilen String istenen elelman var ise true veya false döndürsün
        String[] isimler = {"Ahmet", "Hasan", "Ali", "Trabzonspor"};
        Scanner al = new Scanner(System.in);
        System.out.println("Aramak istediğiniz İsim : ");
        String aranankelime = al.nextLine();
        boolean sonuc = kontrol(isimler, aranankelime);
        if (sonuc = true) {
            System.out.println("Aranan İsim Var ");
        } else {
            System.out.println("Aranan İsim Yok");

        }


    }

    public static boolean kontrol(String[] isimler, String aranankelime) {
        boolean sonucMethod = false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(aranankelime)) {
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }


}
