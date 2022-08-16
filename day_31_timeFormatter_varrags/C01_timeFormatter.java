package JAVA_82.day_31_timeFormatter_varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println("İlk Oluşturulan Tarih : "+ tarihsaat); // 2022-07-25T21:40:43.322895500
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihsaat)); // 25/7/22 09:47

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");
        System.out.println(dtf2.format(tarihsaat)); //25/Tem/2022 21:48 ÖS

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("yyyy /MMMM/dd HH:mm ");
        System.out.println(dtf3.format(tarihsaat)); // 2022 /Temmuz/25 21:55

    }
}
