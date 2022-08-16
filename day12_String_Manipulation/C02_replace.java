package JAVA_82.day12_String_Manipulation;

import java.util.Scanner;

public class C02_replace {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

String str=" Bu gün ha va cok guz el";
        System.out.println(str.replace(" ","")); // tüm boşlukları kaldırdı -

        // hava kelimesini java yapalım

        System.out.println(str.replace("h","j").replace(" ",""));


        // guz el yerine harika yazalım
        System.out.println(str.replace("guz el","harika"));

        // cümleyi replace kullanarak Bugün Java cok guzel yazalım

        str=str.replace("Bu gün","Bugün")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        System.out.println(str);








    }
}
