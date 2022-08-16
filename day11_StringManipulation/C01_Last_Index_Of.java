package JAVA_82.day11_StringManipulation;

public class C01_Last_Index_Of {
    public static void main(String[] args) {

        String cumle = "Java kullanmak iyi, Java kullanmak kolay";
        String kelime = "java";
        // Soru : verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazın
        //  - " Verilen kelime cümlede kullanılmamış"
        //  - " Verilen kelime cümlede bir defa kullanılmamış"
        //  - " Verilen kelime cümlede birden fazla kullanılmamış"

        String cumle1=cumle.toLowerCase();
        int kelimeIlkindex = cumle1.indexOf(kelime);
        int kelimeISonindex = cumle1.lastIndexOf(kelime);

        if (kelimeISonindex == -1) {
            System.out.println(" Kullanılmamış");

        } else if (kelimeIlkindex==kelimeISonindex) {
            System.out.println("Bir defa Kullanıldı");
        } else {
            System.out.println(" Birden çok kullanıldı ");
        }
    }
}

