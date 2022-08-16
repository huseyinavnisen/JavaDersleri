package JAVA_82.day_31_timeFormatter_varrags;

public class C04_VarragsIleEnUzunKelimeyiYazdirma_Deneme {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali", "Veli", "Trabzon", "Çekoslavakyalı");

        System.out.println(enUzunKelimeyiYazdir());
    }

    private static String enUzunKelimeyiYazdir(String...kelime) {
        String uzunKelime=kelime[0];
        for (int i = 0; i <=kelime.length ; i++) {
            if(kelime[i].length()>uzunKelime.length()){
                uzunKelime=kelime[i];
            }
        }
        return uzunKelime;
    }


}
