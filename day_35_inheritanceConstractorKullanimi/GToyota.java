package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class GToyota {
    GToyota() {
        System.out.println("Gtoyota Parametresiz Constractor");
    }

    GToyota(String isim) {
        // super(isim); // parametreli cons yazamayız. Çünkü bu babadır. extensi yok
        System.out.println("Gtoyota Parametreli Constractor");
    }
}