package JAVA_82.day_20_Array;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        int sayi[] = {2, 5, 7};
        System.out.println(sayi[1]);

        int dizi2[] = new int[10];

        dizi2[5] = 255;
        System.out.println(dizi2);  // [I@19dfb72a  Heap memory deki yerini gösteriyor...
        System.out.println(Arrays.toString(dizi2)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        String sinifList[]={"Ali","Hasan","Osman"}; // [Ali, Hasan, Osman]
        System.out.println(Arrays.toString(sinifList));
        sinifList[1]="Müdür";
        System.out.println(Arrays.toString(sinifList)); // [Ali, Müdür, Osman]



    }

}


