package JAVA_82.day_13_Method_Creation;

public class C04_Method_Creation_deneme_Return_esra {
    public static void main(String[] args) {

        int num1=12;
        int num2=34;
        topla(num1,num2);

    }


    public static double topla(double a, double b) {
        double top=a+b;
        System.out.println("Sayıların Toplamı: " + top);
        return top;
    }

}




