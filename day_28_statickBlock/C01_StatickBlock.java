package JAVA_82.day_28_statickBlock;

public class C01_StatickBlock {

    static int sayi;

    static {
         /*
         static block clas üyelerinin tamamından önce çlışır. HATTA MAİN METHODDAN bile önce
         clas ile ilgili genel ayarlamalar yapılır.
         ststic block
          */

        System.out.println("Statick blok çalıştı");

    }



    public static void main(String[] args) {
        System.out.println("Main method çalıştı");
        System.out.println(sayi);

    }

static{
    System.out.println("Main method altındaki Static Method Çalıştı");
}
}
