package JAVA_82.day_17_Nested_For_Loop_While_Loop;

public class C01_Nested_For_Loop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "Emsal Efe";
        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput = "";
        String islenecekKelime = input.replaceAll("\\W", ""); // EmsalEfe
        System.out.print(islenecekKelime.substring(0, 1)); // E
        benzersizInput += islenecekKelime.substring(0, 1);  // E
        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(", " + islenecekKelime.substring(i, i + 1));
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
    }
}
