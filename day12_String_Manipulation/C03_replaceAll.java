package JAVA_82.day12_String_Manipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";
        // str'i --- Bugün Java cok guzel  --  haline getireceğiz.

        // replaceAll() deki all'in amacı aynı özellikteki tüm karakterlere aynı işlemi uygulatır

               /*
               \\  s  -- boşluk
               \\ S   - bosluk dışındaki her şey
               \\ w    -- hafrler ve rakamlar
               \\ W  -- harfe ve rakam dışındaki her şey
               \\ d   - rakamlar
               \\ D   : rakamlar dışındaki her şey
        */


        str = str.replace(" ", "QAZWSX"); // spaceleri de  silmemek için rastgele bir şey koydum
        System.out.println(str);       // 1Bu2gu3nQAZWSXJa*va-QAZWSXcokQAZWSXg3uz/el


        str = str.replaceAll("\\W", ""); // Rakam ve Harf dışındaki her şeyin yerine "" koy yani sil.
        System.out.println(str);       // 1Bu2gu3nQAZWSXJavaQAZWSXcokQAZWSXg3uzel

        str = str.replaceAll("\\d", ""); // Rakamları sil
        System.out.println(str); //  BugunQAZWSXJavaQAZWSXcokQAZWSXguzel


        str = str.replace("QAZWSX", " ");

        System.out.println(str); // Bugun Java cok guzel

    }
}
