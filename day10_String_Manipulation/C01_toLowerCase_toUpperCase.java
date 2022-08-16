package JAVA_82.day10_String_Manipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {


        String str="Beni psikopata baglamayin";



        System.out.println(str.toUpperCase()); // BENİ PSİKOPATA BAGLAMAYİN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        // Büyük - Küçük harf dönüşümünde Locale.forLanguage ile esas dili baz almasını sağlayan Method kullanılır.



    }
}
