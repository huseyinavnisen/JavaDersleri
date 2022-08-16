package JAVA_82.day_17_Nested_For_Loop_While_Loop;

public class C05_While_Loop {
    public static void main(String[] args) {


        // 20 den elliye kadar çift sayıları yazdırın ( sınırlar dahil )

        int bas = 20;
        int bit = 50;

        while (bas <= bit) {
            if (bas % 2 == 0) System.out.print(bas + " ");
            bas++;
        }
    }
}
