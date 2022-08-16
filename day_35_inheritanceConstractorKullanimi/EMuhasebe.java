package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe() {
        System.out.println("Muhasebe Parametresiz Constractor");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe Parametreli Constractor");
    }
}
