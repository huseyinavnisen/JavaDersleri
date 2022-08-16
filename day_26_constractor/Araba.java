package JAVA_82.day_26_constractor;

public class Araba {

    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int modelYili;
    public int fiyat;

    public Araba(String markaR, String modelR, int modelYiliR, int fiyatR) {
        marka = markaR;
        model = modelR;
        modelYili = modelYiliR;
        fiyat = fiyatR;
    }


    public Araba() { // parametresiz girilme ihtimaine karşı

    }

    public void benzinliAracMethodu() {
        System.out.println("Bu araç Benzinli Motora Sahibtir");
    }

    public void maximumHiz(int hiz) {
        System.out.println("Bu araba maximum " + hiz + " km hız yapar ");
    }

}
