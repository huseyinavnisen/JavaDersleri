package JAVA_82.day11_StringManipulation;

import java.util.Scanner;

public class C06_startsWith {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String  input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); // TRUE

        System.out.println(input.startsWith("")); // TRUE

        System.out.println(input.startsWith("gun",5)); // TRUE

        System.out.println(input.startsWith("gun",10)); // FALSE


    }


}

