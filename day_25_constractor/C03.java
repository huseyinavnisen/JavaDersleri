package JAVA_82.day_25_constractor;

public class C03 {

    /*
    default constractor parametresizdir, göremesekte ihtiyaç olduğunda çalışır.
    çok kıskançtır.

    parametreli veya parametresiz bir constractor oluşturulur ise, default
    constractorı siler, yok eder.
     */


    C03 (){


    }

    /*
    bu boş consatractor default ile tıpa tıp aynıdır
    ancak biz oluşturduğumuz için buna default constractor diyemeyiz
    parametresiz constractor deriz.
     */

    String isim="Etga";

    public void method1(){
        System.out.println("C03 method çalıştı");
    }

}
