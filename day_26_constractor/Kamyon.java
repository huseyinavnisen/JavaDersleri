package JAVA_82.day_26_constractor;

public class Kamyon {
    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int modelYili;
    public int fiyat;

    public Kamyon(String marka, String model, int modelYili, int fiyat) {
        this.marka = marka; // this diyerek clastaki instance olan 4. satırdaki variable atamış olduk.
        this.model = model;
        this.modelYili = modelYili;
        this.fiyat = fiyat;
    }

    public Kamyon() { // parametresiz de yaptık ki releated hatası kaybolsun diye

        // olur this("Man","Model bilmiyorum"); // bir tane this() olabilir.

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }



    public void setMarka(String marka) {
        this.marka = marka;
    }



    public String Yazdır1() {
        return
                "Araba Markası=" + marka +
                "\nmodel=" + model;

    }

    public String toString() {
        return "\nMarka=" + marka +
                "\nModel=" + model +
                "\nModelYili=" + modelYili +
                "\nFiyat=" + fiyat;
    }
}
