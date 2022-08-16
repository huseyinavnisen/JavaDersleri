package JAVA_82.day_26_constractor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println(ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Mehmet","Bulutluöz","1.1.2005");
        System.out.println(ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Ahmet","Bıyık","12.12.1998","IT","Beden");
        System.out.println(ogretmen3);
    }
}
