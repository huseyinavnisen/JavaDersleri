package JAVA_82.day_35_inheritanceConstractorKullanimi;



public class Matematikciler extends LOgretmen {
    Matematikciler(){
        System.out.println("Matematik Parametresiz Constractor");
   }

    Matematikciler(String isim){
        this(); // bu clastaki parametresizconst git yani satır 6
        System.out.println("Matematik Parametreli Constractor");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tuğba");
    }
// this() cons call; içinde bulunulan clastaki constractırları
    // super() cal is parent clasta bulunan const çağırırt
    // this() veya super() parametre yapsına uygun const yok ise java
    // CTE verir.
    // cons konusunda this. o calstaki instance variableları eşleştiriyordu yani refere ediyordu
    // inheritance de da super. vardır super. parent clastaki variable eşleştirir.
}
