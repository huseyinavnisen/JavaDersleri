package JAVA_82.day_14_Method_Cretaion;

import JAVA_82.day_13_Method_Creation.C04_Method_Creation;

public class C02_Method_Creation {
    // verilen 3 basamaklı sayının rakamlarını toplamını yazdıram method

    public static void main(String[] args) {

        int input=423;
        rakamlarıTopla(input);
        C01_MethodCreation.tersyazdir("Nuri"); // diğer Clastaki methodu çağırdık


    }

    private static void rakamlarıTopla(int input) {

        int b1=(input/100)%10;
        int b2=(input/10)%10;
        int b3=input%10;

        System.out.println("Girdiğiniz " + input + " Sayının Rakamları Toplamı : " + (b1+b2+b3));


    }
}
