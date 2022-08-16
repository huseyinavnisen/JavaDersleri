package JAVA_82.day_26_constractor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1= new Kamyon();
        System.out.println("KAMYON 1 ÖZELLİKLER"  + kamyon1);

        Kamyon kamyon2=new Kamyon ("Mercedes","4140",2005,500000);
        System.out.println(kamyon2);

        Kamyon kamyon3=new Kamyon ("MAN","AS900",2010,175);
        System.out.println(kamyon3);

        Kamyon kamyon4=new Kamyon ("Scania","s345");
        System.out.println(kamyon4.Yazdır1());
    }
}
