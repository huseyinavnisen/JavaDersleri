package JAVA_82.day_39_exception;

public class C04_ExceptionTurleri {

    public static void main(String[] args) {
        String str;
        // System.out.println(str);// ilk değeri yok, null hata verir
        str = null;
        System.out.println(str);// null
        if(str.equals(null)) { // NullPointerException===> çalıştırda gör...zaten sarı yaptım orayı
            System.out.println("eşit");
        }
    }
}
