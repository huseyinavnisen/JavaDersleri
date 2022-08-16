package JAVA_82.day_30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasıdaki sureyi bul
        LocalDate tarih= LocalDate.of(1975,8,13);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih,bugun);
        System.out.println(period); // P46Y11M10D
    }
}
