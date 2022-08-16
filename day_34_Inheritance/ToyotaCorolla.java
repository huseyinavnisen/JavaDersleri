package JAVA_82.day_34_Inheritance;

public class  ToyotaCorolla extends Toyota { // Toyota clasının extends yaptık. Baba olarak onu seçtik
    public static void main(String[] args) {
        /*
        child classtan parent clasa erişimde
        access modifier kurallarını PYPASS edemeyiz
        Mesela; parent clastaki private class üyelerini child classtan kullanamayız
        aynı şekilde parent ve child farklı pacgagelerde ise
        parent classdaki default access modifieri olan
        class üyelerini chilf classdan kullanamayız.
         */

     ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model Belirtilmedi
    }
}
