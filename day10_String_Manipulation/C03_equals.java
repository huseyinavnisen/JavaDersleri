package JAVA_82.day10_String_Manipulation;

public class C03_equals {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1==str2); // FALSE
        System.out.println(str1==str3); // FALSE - AMA TRUE DÖNDÜRDÜ....
        System.out.println(str1==str4);

        System.out.println(str1==str5); // FALSE
        System.out.println(str1.equals(str5)); //TRUE
        System.out.println(str1.equals(str4));  // TRUE
        System.out.println(str3.equals(str5)); // TRUE

        // stringlerde == yaparken aynı string karşılaştırılsa bile HATA verebilir. Bunun için equals kullanmalıyız.
        // equals kullanacak isek dikkat edeceğimiz tek şey metinlerin bire-bir aynı olmasıdır.


    }

}
