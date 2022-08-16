package JAVA_82.day_38_exception;

public class C02_Exception {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
            try {
                System.out.println(a / b);
            } catch (Exception e) { // catc den sonraki parantezde karşılacabileceğimiz exception türünü yazarız Örnek : Exception e
               // System.out.println("Payda Sıfır Oldu Dikkat Et");
            }
            b--;
            sayac++;
        }
        // tüm hataları kapsayan Parent Exception adı : ==> Exception
        // onlarca excepton vardır...
    }
}

