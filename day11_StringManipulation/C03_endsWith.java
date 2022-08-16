package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C03_endsWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str = "Ah be Java";
        System.out.println(str.endsWith("ava")); //True
        System.out.println(str.endsWith("be Java")); //True
        System.out.println(str.endsWith("")); //True




    }


}

