package JAVA_82.day_14_Method_Cretaion;

import JAVA_82.day_13_Method_Creation.C04_Method_Creation;

public class C01_MethodCreation {
    public static void main(String[] args) {
         // İnput olarak verilen 4 harfli stringi ters çeviren method



       tersyazdir("Kaya");

C04_Method_Creation.topla(40,60);



    }

    public static void tersyazdir(String input) {

        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println("Girilen Kelimenin Tersten Yazılışı : " + tersInput);

    }

}
