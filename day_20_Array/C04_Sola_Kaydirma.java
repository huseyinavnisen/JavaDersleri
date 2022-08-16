package JAVA_82.day_20_Array;

import java.util.Arrays;

public class C04_Sola_Kaydirma {
    public static void main(String[] args) {
        // 3 elamnlı dizinin elemanlarını 1 adım sola kaydır.

        int sayilar[]={1,2,3};
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3]



        int temp=sayilar[0];


        for (int i = 0;  i<sayilar.length-1 ; i++) {
            sayilar[i]=sayilar[i+1];
        }
         sayilar[sayilar.length-1]=temp;

        System.out.println(Arrays.toString(sayilar));  // [2, 3, 1]

   // şimdi işlemi eski haline alalım

        temp=sayilar[sayilar.length-1];

        for (int i = sayilar.length-1; i >0 ; i--) {
            sayilar[i]=sayilar[i-1];
        }
        sayilar[0]=temp;

        System.out.println(Arrays.toString(sayilar));  // [1, 2, 3]



    }




}
