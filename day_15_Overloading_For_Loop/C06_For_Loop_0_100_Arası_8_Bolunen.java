package JAVA_82.day_15_Overloading_For_Loop;
import java.util.Scanner;

public class C06_For_Loop_0_100_Arası_8_Bolunen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        for(int i = 100; i >=1; i--)  {

            if (i%8==0) System.out.print(i+ " ");
        }


    }
}
