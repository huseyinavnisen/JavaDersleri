package JAVA_82.day_32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");
        System.out.println(sb); // Kayra ==> ilginç Sebebi şu, bu method String döndürür. Stringbuilder
        // eski halini değiştiremez

        sb.subSequence(0,3);
        System.out.println(sb); // Kayra
    }
}
