package JAVA_82.day_37_overriding;

public class ESupra extends EToyota {
    void yakit() {
        System.out.println("Supra mazot kullanır");
      /*
      Private methodlar Override edilemez
      eğer Child Clasta Parent clastaki Private method ile aynı signutrede bir method
      oluşturursanız, bu overriden method olmaz
       */
    }

    @Override
    void motor() {
        System.out.println("Supra : 1.6 Hybrid Motor Kullanır");
    }
// System.out.println("Sırali 6 silindir 2JZ kullanır");
    // @Override notasyonu javaya bir görev verir.
    // java bu notasyon ile birbirine Override edilmiş iki clası devamlı kontol eder
    // override edilmiş bir method silinirse hemen uyayır bizi ki kafamıza göre hareket etmeyelim diye
    // o methodu silersek CTE verir.
    // @Override notasyonu kullanmak mecburi değildir.İstersek kulanmayabiliriz...


    @Override
    void marka() {
        System.out.println("Supra Markanın Kralıdır");
    }

    public static void main(String[] args) {
        ESupra supra1 = new ESupra();
        supra1.yakit();
        supra1.marka();
        supra1.motor();

    }

}
