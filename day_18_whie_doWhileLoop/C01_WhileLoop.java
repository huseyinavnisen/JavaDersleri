package JAVA_82.day_18_whie_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
                Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf = 'a';
        char sonHarf = 'z';
        String buyult = "";
        int i=0;

        char temp = ilkHarf;

        while (temp <= sonHarf) {
            buyult = (temp + "").toUpperCase();
            temp += 1;
            i++;
            System.out.print(buyult + " ");
        }
    }
}
