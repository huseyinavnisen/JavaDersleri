package JAVA_82.day_37_overriding;
public class C01_OverLoading {
    public static void main(String[] args) {
/*
bir classta aynı isimde ve aynı signature sahip iki method olmaz
aynı clasta aynı isimde bir sürü method yapmak için mutlaka signature yeri veya tipini
değiştirmeliyiz.
 */
    }
    void ekleme(){ }
    void ekleme(int sayi){ }
    void ekleme(double sayi1){ }
    void ekleme(double sayi1, int sayi2){ }
    void ekleme(int sayi2, double sayi1){ }
}
