package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class Child extends BParent {
    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child Kulübü";

    Child() { // Constractor oluşturuldu
        System.out.println("Child Constractor Çalıştı");
    }

    public static void main(String[] args) {
        // AGrandParent gp1 = new AGrandParent();
        // bu objeyi çalıştırmak için grandpa çalışır, parent ve child çalışmaz


        Child child1 = new Child(); // Bu classtan Constractor oluşturuldu
        child1.grandpaKlupAdi = "Çocuklar"; // taaa dedeye ulaştı ve değiştirebildik.
        child1.parentKlupAdi = "Çocuklar2"; // ta babaya ulaştık ve değiştirebildik.

        // child1 objesi için child const calışır
        /*
        java da bir clası kullanabilmek için o clastan bir obje oluşturu
        ve o clasin constractorunu kullanırdık.
        java inheritance'da parent claslardaki özelliklerini kullanabilmek için
        otomatik bir yapı kurmuştur.
        Örneğin biz child clasında kendi clasından bir obje oluşturduğumuzda
        child constractorunu kullanır.

       java Child(){} gördüğünde önce parent'in constractorunu çalıştırır
       buradan Parent constractoruna gider.
       Parent clasınnda Parent(){} görünce bununda parent i olan dede
       Grandparnt cons çalışması gerekir der ve onu çalıştrır.
       Grandpa çalışır - Parenet çalışır sonra child çalışır.
         */



    }

}
