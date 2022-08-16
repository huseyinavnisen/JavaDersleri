package JAVA_82.day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+ "  "+ str2+ " "+sayi1+sayi2);       // Java Guzeldir 54
        System.out.println(str1+ "  "+ str2+ " "+(sayi1+sayi2));     // Java Güzeldir 9
        System.out.println();

        System.out.println(str1 + " "+sayi1 + " " + str2);           // Java 5 Güzeldir
        System.out.println(str1 + "  "+(sayi1+sayi2)+sayi2);         // Java 94
        System.out.println(str1 + " "+(sayi1-sayi2)+(sayi1+sayi2));  // Java 19
        System.out.println("" + sayi1+sayi2+ " "+str2 );             // 54 Güzeldir
        System.out.println(str1.concat(" ").concat(str2));









    }
}
