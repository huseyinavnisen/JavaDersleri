package JAVA_82.day_38_exception;

public class C01_Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
       // System.out.println(a / b);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at JAVA_82.day_38_exception.C01_Exception.main(C01_Exception.java:7)
        int c = 1000;
        int d = 50;
        int sayac=1;

        while(sayac<100){
           if (d==0) {
               System.out.println("Payda SIFIR oldu dikkat et");
           } else {
               System.out.println(c / d);
           }
            d--;
            sayac ++;
        }

    }


}

