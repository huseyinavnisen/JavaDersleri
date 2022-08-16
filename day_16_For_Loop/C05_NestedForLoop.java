package JAVA_82.day_16_For_Loop;

public class C05_NestedForLoop {


    public static void main(String[] args) {

        for (int i = 1; i <= 5; ++i) {


            for(int k=1; k<=10; ++k){
                System.out.print("i=" + i + " "+ "k=" +k  + " " );
            }
            System.out.println( i+ ".DIŞ DÖNGÜ SONU ");
        }
    }
}
