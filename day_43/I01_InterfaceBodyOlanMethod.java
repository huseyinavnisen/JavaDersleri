package JAVA_82.day_43;

public interface I01_InterfaceBodyOlanMethod {
    void motor();
    public void yakit();
    public abstract String aku();
    /*
    normal bir clasta olduğumuzu düşünsek iki adet access modifier
    kullanamayız
     */
    public default void teker () {
        System.out.println("tüm arabaların tekeri vardır");

    }
    public static  void direksiyon() {
        System.out.println("Static Merhod : tüm arabaların direksiyonu vardır");

    }
}
