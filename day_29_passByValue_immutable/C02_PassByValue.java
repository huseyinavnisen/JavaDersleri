package JAVA_82.day_29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        // NOT: birden fazla element içeren array ve arralist gibi yapılarda
        //passByValue geçerlidir. JAVA çok katıdır bu konuda.
        //ğer merthod içinde array veya list in kendisi yeniden oluşturulma şeklinde
        // değiştirilirse; java değişen değeri değil orjinal değeri alır.
        //  ANCAAAAAK :  array veya list değiştirilmeden sadece elemanlar değişritirlirse
        // JAVA obje değişmediği için(referans aynı) aynı array veya listi bize döndürür ANCAAAK
        // içindeki elemanlar değişmiş olur.

        /*
        4 elamanlı bie array oluşturalım ve methoda göndereleim.
        methoda yeni elemanlı bir array atayıp bu yeni arraye rastgele
        100 den küçük 3 sayı atayalım ve methodda arrayi yazdırlaım.
         */
    int [] arr={3,5,8,10};

    arrayDegistir(arr);
    System.out.println("main method;  diğer method çalıştıktan sonra" + Arrays.toString(arr));

    }

    public static void arrayDegistir(int[] arr) {

        arr=new int[3];
        Random rnd= new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println("Method içindeki hali: " + Arrays.toString(arr));

    }


}
