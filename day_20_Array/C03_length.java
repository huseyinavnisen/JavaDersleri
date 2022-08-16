package JAVA_82.day_20_Array;

public class C03_length {
    public static void main(String[] args) {

        int sayilar[]={1,2,3};
        String isimler[]=new String[20];

        System.out.println("Sayılar array'in uzunluğu :" + sayilar.length); // 3 elemanlı ==3

        System.out.println("Sayılar array'in uzunluğu :" + isimler.length); // 20 elemanlı ==20

        System.out.println(isimler[2]);  // null atar çünkü boş dizi

        System.out.println(sayilar[sayilar.length-1]); // 3
    }
}
