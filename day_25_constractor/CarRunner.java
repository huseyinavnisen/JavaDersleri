package JAVA_82.day_25_constractor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.modelYili=2020;
        car1.marka="Toyota";

        Car car2=new Car();
        car2.fiyat=200000;
        car1.modelYili=2010;
        car1.marka="Peugeot";

        Car car3=new Car();






        System.out.println("Marka  :"+car1.marka);
        System.out.println("Model :"+car1.model); // Model :Model Belirtilmedi
        System.out.println("Fiyat  :"+car1.fiyat);
        car3.benzinliAracMethodu();
        car3.maximumHiz();
        System.out.println(car1.modelYili + "  "+ car1.model+ "  "+ car1.fiyat);

    }

}
