package JAVA_82.day_32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Calm down");
        sb.replace(5,10,"Up"); // Calm Up  ==> 4 harfli down alındı iki harfli Up koyuldu.
        System.out.println(sb);

        sb.replace(4,5,"---");
        System.out.println(sb); // Calm---Up

        sb.replace(4,7," ");
        System.out.println(sb); // Calm Up

        sb.replace(5,7,"Down");
        System.out.println(sb); // Calm Down
    }
}
