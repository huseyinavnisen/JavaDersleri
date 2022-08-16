package JAVA_82.day_33_encapsulation;

public class Ogretmen {
    private String isim;
    private String soyisim;
    private String brans;
    /*
    bazen yetkiyi sınırlamak için değil
    görevi tanımlamak için encapsulation kullanılır
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
