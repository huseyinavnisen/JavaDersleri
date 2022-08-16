package JAVA_82.day_33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tülay");
        System.out.println(ogr1.getIsim());
        // burada amaç datayı gizlemek değil daha anlaşılır kod yazmak içindir.
    }
}
