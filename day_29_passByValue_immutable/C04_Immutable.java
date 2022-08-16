package JAVA_82.day_29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable : değiştirilemez
        mutable : değiştirilienbilr.

        en meşhur immutable class : String
         */
        String str = "Yıldız Bank";
        System.out.println(str.toUpperCase()); // YILDIZ BANK
        str.toLowerCase();
        System.out.println(str); // Yıldız Bank


    }


}
