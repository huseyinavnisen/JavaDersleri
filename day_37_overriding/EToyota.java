package JAVA_82.day_37_overriding;

public abstract class EToyota extends DAraba {
    // notasyon geldi


    void marka() {
        System.out.println("Marka Toyotadır");
    }

    @Override
    void motor() {
        System.out.println("Toyota Japon Motor Kullanır");
    }
}
