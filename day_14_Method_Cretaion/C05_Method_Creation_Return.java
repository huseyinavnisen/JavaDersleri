package JAVA_82.day_14_Method_Cretaion;

import java.util.Scanner;

public class C05_Method_Creation_Return {
    public static void main(String[] args) {

        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun soncunu main method'da bir variable'a atama yaparsak programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */

        // Kullanıcıdan Şehir ismini ve doğum tarihini alıp
        // Bunları programda kullanacağımız Fortmatta bize döndüren bir method oluşturun
        // Şehir ismini Programımızda büyük harf olarak
        // tarihi ise 2022 - 06 - 30 şeklinde kullanmak istiyoruz.

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println(tarih);
        System.out.println(sehir);

    }

    public static String tarihAl() {
        String tarih = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Yıl Giriniz : ");
        int yil = scan.nextInt(); // yılı yanlış girmemesi için  denetim yapalım
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yıl İçin Doğru Bir Sayı Yazmalısınız(1900-2100)");
        }

        System.out.println("Ayı Giriniz : ");
        int ay = scan.nextInt(); // ayı yanlış girmemesi için  denetim yapalım
        if (ay <=0 || ay > 12) {
            System.out.println("Ay İçin Doğru Bir Sayı Yazmalısınız(1-12)");


        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }

        System.out.println("Lütfen Ayın Kaçıcı Gün olduğunu Tamsayı Olarak Giriniz : ");
        int gun = scan.nextInt(); // gün yanlış girmemesi için  denetim yapalım
        if (gun<=0 || gun>31){
            System.out.println("Gün olarak 1-31 arası giriniz");
        } else if (gun<10){
            tarih=tarih+"0"+gun;
        } else {
            tarih =tarih+gun;
        }
        return tarih;
    }


    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);

        System.out.println("Şehri Giriniz : ");
        String sehir=scan.next();
        String sehirAdı=sehir.toUpperCase();

        return sehirAdı;
    }
}
