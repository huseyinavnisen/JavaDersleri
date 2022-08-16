package JAVA_82.day_29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="Mine";
        isim=isim.toUpperCase();
        System.out.println(isim); // MINE oldu ancak Mine hala biryerlerde duruyor.
    }
}
