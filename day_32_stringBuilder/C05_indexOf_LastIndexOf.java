package JAVA_82.day_32_stringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay")); //0
        System.out.println(sb); // Pay attenaiton please

        System.out.println(sb.indexOf("a")); //1

        System.out.println(sb.indexOf("e",10)); // 16

        System.out.println(sb.lastIndexOf("e")); // 19

        System.out.println(sb.lastIndexOf("a",5)); // 4




    }
}
