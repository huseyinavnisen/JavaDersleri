package JAVA_82.day_17_Nested_For_Loop_While_Loop;

public class C02_Nested_For_Loop {
    public static void main(String[] args) {
        // verilen sayıya göre çarpım tablosu
        // input 3
        // 1 2 3
        // 2 4 6
        // 3 6 9

        int input=4;

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j + " ");

            }
            System.out.println("");
        }

    }
}
