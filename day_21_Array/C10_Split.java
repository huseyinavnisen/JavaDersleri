package JAVA_82.day_21_Array;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {

         // split() bir array methodu değil String methodur. ancak Array döndürdüğü için buarada anlatılıyor

        String cumle="Java ne kadar guzel";
        String dizi[]=cumle.split("");
        System.out.println(Arrays.toString(dizi));


    }
}
