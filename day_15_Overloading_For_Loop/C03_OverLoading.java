package JAVA_82.day_15_Overloading_For_Loop;

public class C03_OverLoading {
    public static void main(String[] args) {

        topla(5,7); // public static void topla(int s1,int s2) methodu
        topla(10.3,25.4); // public static void topla(double s1,double s2)  methodu
        topla(3.4,5); //    public static void topla(double s1,int s2)
    }

public static void topla(int s1,int s2){
    System.out.println("İki İnteger'in toplamı : " + (s1+s2));

}


     // public static void topla(int s1,int s2){
        // System.out.println("İki İnetger'in toplamı : " + (s1+s2));  // HATA VERİYOR AYNISI YAZAMAZSINIZ


    public static void topla(int s1,double s2) {
        System.out.println("Bir İnteger ve Bir Double toplamı : " + (s1 + s2));

    }

    public static void topla(double s1,int s2) {
        System.out.println("İki İnetger'in toplamı : " + (s1 + s2));

    }

    public static void topla(double s1,double s2) {
        System.out.println("İki İnetger'in toplamı : " + (s1 + s2));

    }


}


