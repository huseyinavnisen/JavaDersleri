package JAVA_82.day_18_whie_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        // 9 - 190 a kadar 7 nin katı olan tamsayıları ekrana yazdırın

        int bas = 9;
        int bitis = 190;
        int temp = bas;

        // while do

        while (temp < bitis) {
            if (temp % 7 == 0) System.out.print(temp + " ");
            temp++;
        }

         // do While

        System.out.println("");


        temp=bas;
        do{

            if (temp % 7 == 0) System.out.print(temp + " ");
            temp++;

        }while(temp<bitis);


    }
}
