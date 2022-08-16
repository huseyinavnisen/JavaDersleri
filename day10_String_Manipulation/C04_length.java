package JAVA_82.day10_String_Manipulation;

public class C04_length {
    public static void main(String[] args) {
        String str = "Java öğren, işi kap";
        System.out.println(str.length()); // 19 karakter - index - 18

        // en büyük index = string.length - 1 dir

        System.out.println(str.charAt(str.length() - 1)); // son karakter ==> p
        System.out.println(str.charAt(str.length() - 3)); // son karakter ==> k


        /*
     java da null pointer bir değer değildir
     karşısına yazıldığı variable in hiç bir değer almadığını gösterir
     */


        String str2 = ""; // bir değer atanmıştır ama değeri HİÇLİKTİR

        String str3 = null; // hiç bir deger atanmamıştır.

        System.out.println(str2.length()); // SONUÇ ==> 0
        // System.out.println(str3.length());  // HATA MESAJI VERİR


    }
}
