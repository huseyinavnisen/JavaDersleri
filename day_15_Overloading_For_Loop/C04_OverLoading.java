package JAVA_82.day_15_Overloading_For_Loop;

public class C04_OverLoading {
    public static void main(String[] args) {

        topla(5, 7);
        topla(10.3, 25.4);
        topla(3.4, 5);
        topla(5, 6.2); // Önemli; bu parametre ile aynı Method yok ama Data Casting yapar uygun var ise onu kullanır.

// Java hangi methodu kullanacağına karar verirken Optimizasyon Yapar.
        // eğer hiç Cast yapmadan kullanabileceği bir method varsa onu kullanır.
        // eğer cast yapması gerekiyor ise en az cast yapacağı methodu kullanır.


    }

     public static void topla(int s1, int s2) {
         System.out.println("İki İnteger'in toplamı : " + (s1 + s2));
     }


    public static void topla(double s1, int s2) {
        System.out.println("Bir Double, Bir İnteger'in toplamı : " + (s1 + s2));
    }
    public static void topla(double s1, double s2) {
        System.out.println("İki Double'in toplamı : " + (s1 + s2));
    }

}


