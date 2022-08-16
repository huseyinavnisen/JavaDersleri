package JAVA_82.day_17_Nested_For_Loop_While_Loop;

import java.util.Scanner;

public class C04_Nested_For_Loop_Ankara {
    public static void main(String[] args) {

/*verilen inputa göre * lardan üçgen yapın
        // örnek input = 4 ise
        *
        **
        ***
        ****

 */
        Scanner al=new Scanner(System.in);
        System.out.println("Kelimeyi Girin ");
        String kel=al.next();
        int uz=kel.length();




        for (int i = 1; i <=uz ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(kel.substring(j-1,j));

            }
            System.out.println("");
        }


        for (int i = 2; i <=uz ; i++) {
            for (int j = i; j <=uz ; j++) {
                System.out.print(kel.substring(j-1,j));

            }
            System.out.println("");
        }




    }
}
