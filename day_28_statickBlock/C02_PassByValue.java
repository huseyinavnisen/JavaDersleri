package JAVA_82.day_28_statickBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satısFiyati=100;

        System.out.println(indirimliFiyat(satısFiyati));// 90
        System.out.println(satısFiyati); // 100 değeri değişmedi ki

        System.out.println(indirimliFiyat(satısFiyati));// 90

        // iki farklı methoda ( skobta ) aynı isimde variable olabilir.

    }

    public static double indirimliFiyat(double orjinalFiyat){
        // bu method %10 indirim yapıp geri döndürsün

        return orjinalFiyat*0.9;
    }
}
