package JAVA_82.day_26_constractor;

public class Ogretmen {
    public String isim="İsim Belirtilemdi";
    public String soyIsim="Soyisim Belirtilemdi";
    public String dogumTarihi="Doğum Tarihi Belirtilemdi";
    public String brans="Branş Belirtilemdi";
    public String yanBrans="Yan Branş Belirtilemdi";

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return  "\nİsim=" + isim +
                "\nSoy İsim=" + soyIsim +
                "\nDogum Tarihi=" + dogumTarihi +
                "\nBrans=" + brans +
                "\nYan Brans=" + yanBrans ;
    }

    public Ogretmen() {
    }
}
