package JAVA_82.day_13_Method_Creation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        // str1="$13.99"
        // str2="$10.55" bunları toplayın

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D",""); // sadece sayı kaldı
        double sayi1=Double.parseDouble(str1); // srting sayıya çevrildi

        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);

        System.out.println(("$"+(sayi1+sayi2)/100));

    }

}
