package JAVA_82.day_27_Constractor;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {



        /*

        clas levelda iki tür variable oluşturabiliriz.
        static ( class) variable
        instance (obje ) variable

         */

        // System.out.println(rakam); // rakam tanımaz hata verir çünkü instance
       //  System.out.println(sayi); // 10 yazar
        // static tüm clastan kullanılabilir.
        // instance variable olanlar static olmayan methodlarda kullanılır.
        // instance variablere static methoddan ulaşmak istersek obje oluşturulur.


        C01 obj1 = new C01();

        System.out.println(" obj1 Rakam değeri : "+obj1.rakam); // 5
        System.out.println(" obj1 sayi değeri : "+ obj1.sayi); // direk ulaşılabilir obj1.sayi yerine sayi yazabilrdin diyor. sarıya boyadı
        System.out.println(" obj1 sayi değeri : "+ sayi); // bu şekilde de olur. Çünkü sayi static

        obj1.rakam += 1;
        sayi += 1;

        System.out.println(" obj1 Rakam değeri 1 arttı  : " + obj1.rakam); // 5+1 = 6
        System.out.println(" obj1 sayi değeri  1 arttı :" + sayi);  // 10 + 1 = 11


        C01 obj2=new C01();

        System.out.println(" obj2 Rakam değeri : " + obj2.rakam); // rakam obj2 oluştuktan sonra değişen bir şey yok. ilk halini alır ==> 5
        System.out.println(" obj1 sayi değeri : " + sayi); // sayi static olduğu için eski değerini korur. Clastan değerini alır ve ==>11

        obj2.rakam += 1;
       sayi += 1;

        System.out.println(" obj2 Rakam değeri 1 arttı  : " + obj2.rakam); // 6
        System.out.println(" obj2 sayi değeri  1 arttı :" + obj2.sayi); // 12



        /*
        instance variable lar obje variable oldukları için herhangi bir satırda  isntance variable değeirninin ne olduğunu
        bulabilmek için OBJE OLUŞTURULDUKTAN sonraki değişime, atamalara bakarız...

        statiic variable ın değerinin bulmak için CLASIN BAŞINDAN itibaren adım adım kod incelenmelidir.
         */


    }

}
