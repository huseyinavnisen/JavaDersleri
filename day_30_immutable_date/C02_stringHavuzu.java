package JAVA_82.day_30_immutable_date;

public class C02_stringHavuzu {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true - içeriğe bakar
        System.out.println(str1.equals(str3)); // true - içeriğe bakar
        System.out.println(str1 == str3); // false
        System.out.println(str2.equals(str4)); //  true - içeriğe bakar
        System.out.println(str2 == str4); // false


/* Yeni bir String oluştururuken
1 - Eşitliğin sağında new keywordu olursa direk yeni bir obje ve ref oluşturulur.
2 - Eğer eşitliğin sağında bir method çalışıyor veya + bir işem yapılıyor ise
String immutable olduğu için değişikliği kaydetmek üzere hemen bir kopya string ve ref oluşturur, sonra
değeri heaplayıp yeni bir kopya objinin içine koyar.

 */


        String str5 = "Ali Can";
        System.out.println(str1.equals(str5)); // true - içeriğe bakar-  Normal zaten
        String str6 = str1;
        System.out.println(str5 == str1); // true - ilginççççççç - bu anormal
        System.out.println(str1 == str6); // true - ilginççç - bu anormal
        System.out.println(str5 == str6); // true

        System.out.println("str1- str4 : " + str1.equals(str4)); //  true - içeriğe bakar
        System.out.println("str1- str4 : "  + (str1 == str4)); // true

        /*
       Eğer yeni string objesi oluşturulurken new kelimesi YOK ise veya eşitliğin sağında bir  + işlemi yok ise Java Bakar;
        daha önce oluşturulan string havuzundaki objelerden bire-bir aynı string var ise o objeyi ve rfereransını kullanır.
        birebir aynısı yok ise yeni bir obje oluşturur.
         */
    }
}
