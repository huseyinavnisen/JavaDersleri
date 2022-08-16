package JAVA_82.day_25_constractor;

public class Car {
    /*
    bu class biim kalıphanemizdir. Bir araba satışı için ihtiyacımız olan
    variable ve methodları bu classta oluşturacağız ve farklı classlarda
    araba verisi oluşturmak için; bu clastan obje oluşturup işlem yaparız.
     */

public String marka="Marka Belirtilmedi";
public String model="Model Belirtilmedi";
public int modelYili;
public int fiyat;

public void benzinliAracMethodu(){
    System.out.println("Bu araç Benzinli Motora Sahibtir");
}

public void maximumHiz(int hiz){
    System.out.println("Bu araba maximum " + hiz + " km hız yapar ");
}
    public void maximumHiz(){
        System.out.println("Bu arabanın maximum hızı belirtilemedi ");
    }

}
