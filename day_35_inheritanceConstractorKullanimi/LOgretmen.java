package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class LOgretmen {

    LOgretmen(){
        System.out.println("LOgretmen Parametresiz Constractor");
    }

    LOgretmen(String isim){

        this();
        System.out.println("LOgretmen Parametreli Constractor");
    }
}
