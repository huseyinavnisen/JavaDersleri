package JAVA_82.day12_String_Manipulation;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartno="1234 6589 7458 9658";

        System.out.println(isim.substring(3));  // eyman

        System.out.println(soyisim.substring(soyisim.length()-3)); // fil - son 3 harfi

        System.out.println(isim.substring(2,4)); // le - 2.index ile başla 4.indexe kadar git

        // isim ve soyisimin il harfi Büyük, gerisi *
        // Kredi kartının ilk 4 hartfi görümsün, gerisi * olsun

        String isimilkharf=isim.substring(0,1).toUpperCase(); // S
        String geriyekalanlar=(isim.substring(1)).replaceAll("\\w","*");

        String soyisimilkharf=soyisim.substring(0,1).toUpperCase(); // S
        String soyisimgeriyekalanlar=(soyisim.substring(1)).replaceAll("\\w","*");

        System.out.println(isimilkharf+geriyekalanlar+ " " + soyisimilkharf+soyisimgeriyekalanlar );

        String kkIlk4= kartno.substring(0,4);
        System.out.println(kkIlk4 + " **** **** **** ");


    }
}
