package JAVA_82.day_39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IciceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis = new FileInputStream("src/JAVA_82/day_39_exception/Test.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı veya dosya Bozuk");
        } catch (IOException e) {  // IOException e ==> PARENT EXCEPTİONDUR
            System.out.println("Dosyadan Bilgiler Okunamadı"); // read() in exceptionu
        }
        /*
        Not : iki tane catch var ise bunlar birbiri ile parent - child ilişkisi var ise
        en özel olan ve az sınırlayıcı olan catch en önce yazılır.
         */

    }

}
