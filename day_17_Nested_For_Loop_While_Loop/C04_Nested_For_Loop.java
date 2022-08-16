package JAVA_82.day_17_Nested_For_Loop_While_Loop;

public class C04_Nested_For_Loop {
    public static void main(String[] args) {

/*verilen inputa göre * lardan üçgen yapın
        // örnek input = 4 ise
        *
        **
        ***
        ****

 */

        int input=4;


        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 2; i <=input ; i++) {
            for (int j = i; j <=input ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        for (int i = input-1; i >=1 ; i--) { // mehmet hocanın çözümü
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
