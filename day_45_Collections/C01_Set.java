package JAVA_82.day_45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir arraydeki tekrar eden elementleri
        // silip tekrarsız aynı arraya array haline dönüştüren kod yazalım
        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 3, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int i = 0; i <arr.length ; i++) {
            tekrarsizSet.add(arr[i]);
        }
        System.out.println(tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr=new int [tekrarsizSet.size()];
        int i=0;

        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }
arr=tekrarsizArr;
        System.out.println("Son Hali : "+ Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }



}
