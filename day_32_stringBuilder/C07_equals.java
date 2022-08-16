package JAVA_82.day_32_stringBuilder;

public class C07_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); // false
        // StrinBuilder de equals methodu aynı obje olursa TRUE olur
        // Strindeki gibi düşenmemek lazım.

        System.out.println(sb1.equals(sb1)); // TRUE





    }
}
