package JAVA_82.day_25_constractor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C02_constractor {
    public static void main(String[] args) {

        C01 obj1=new C01(); // clas adi + objenin adı = keyword + constractor
        // constractor bir clasin obje üretmesi için  kullandığı kod bloğudur.


        System.out.println(obj1.sayi); // 20 yazar
        obj1.deneme(); //  "C01'den method çalışır"

        Random rnd= new Random();

        List<String> liste =new ArrayList<>();

        // constractor method değildir. yeni bir şeyyy. Constractor constractor dır




    }


}
