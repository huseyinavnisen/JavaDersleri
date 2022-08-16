package JAVA_82.day_32_stringBuilder;

public class C03_reverse {
    // verilen inputu tersine çevirip döndüren bitr method
    public static void main(String[] args) {
        String input = "Hey gidi for loop günleri";
        String tersInput = tersineCevir(input);
        System.out.println(tersInput); // irelnüg pool rof idig yeH
    }


    public static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
        return  sb.reverse().toString();

    }
}
