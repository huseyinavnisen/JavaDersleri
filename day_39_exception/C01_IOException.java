package JAVA_82.day_39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException { // bu method çalışırsa FileNotFoundException olabilir
        /*
        Java'da bilgisayardaki bir dosyayı açmak istiyorsak
        FileInputStream Class'ından yardım alırız.
        Java'dan dışarıya kayıt yapmak istiyorsak;
        FileOutputStream Classından faydalanırız.
         */
        FileInputStream fis = new FileInputStream("src/JAVA_82/day_39_exception/Test.txt");

    }
/*
her altı çizme error değildir. bazen CT exception dur
Compile Time Exception oluştuğunda Java çözüm için iki çözüm önerir
1 - Try - Catch ile çevrelemek
2 - method signature'ina throws keyword ile eklenen exception türünü yazmak
 throw Exception olayın farkındayım demektir.
 try - catch ile hata olursa gör ama çalışmaya devam ederiz.
 throw exception ile de hatayı gör ancak sonlandır demektir.

 */


}
