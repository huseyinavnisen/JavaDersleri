package JAVA_82.day10_String_Manipulation;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "AlI CAN";
        String str4 = "Ali Can_";


        System.out.println(str1.equals(str2));  // FALSE
        System.out.println(str1.equalsIgnoreCase(str2)); // TRUE

        System.out.println(str2.equals(str3));  // FALSE
        System.out.println(str2.equalsIgnoreCase(str3)); // TRUE

        System.out.println(str1.equals(str4));  // FALSE
        System.out.println(str1.equalsIgnoreCase(str4)); // FALSE


    }
}
