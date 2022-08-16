package JAVA_82.day_16_For_Loop;

public class C03_For_Loop_Soru_2 {
    public static void main(String[] args) {

// 10 - 30 arasındaki sayıları arasında virgül koyarak yan yana yazdırın

        int bas = 10;
        int son = 30;


        for (int i = bas; i <= son; i++) {
            if (i < son) {
                System.out.print(i + ", ");
            } else System.out.println(i);
        }
    }
}