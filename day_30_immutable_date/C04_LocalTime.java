package JAVA_82.day_30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1); // 19:15:42.347772800

        // Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond()); // 6

        System.out.println(time1.plusSeconds(100000)); // 23:18:32.567286200




    }

}
