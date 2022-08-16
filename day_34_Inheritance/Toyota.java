package JAVA_82.day_34_Inheritance;

public class Toyota {
    protected String marka = "Toyota";
    protected String model = "Model Belirtilmedi";
    protected String yakit = "Yakıt Türü Belirtilmedi";

    protected void motor(){
        System.out.println("Toyota Çevreci Motor Kullanır");
    }
    protected void aku(){
        System.out.println("Toyota Modele Göre Akü Kullanır");
    }

}
