package JAVA_82.day_30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilderHizKontrol {
     /*
     String mi hızlı Stringbuilder mi?
      */
     public static void main(String[] args) throws InterruptedException {

         String str="Ahhhh Java" ;
         LocalTime baslangıc=LocalTime.now();
         for (int i = 0; i <10000 ; i++) {
             str+=".";
         }
         LocalTime bitis=LocalTime.now();
         System.out.println("String İçin geçen Zaman-ns : " + (bitis.getNano() - baslangıc.getNano()));



         StringBuilder sb=new StringBuilder("Ahhhh Java") ;
         baslangıc=LocalTime.now();
         for (int i = 0; i <10000 ; i++) {
             str+=".";
         }
         bitis=LocalTime.now();
         System.out.println("StringBuilder  İçin geçen Zaman-ns : " + (bitis.getNano() - baslangıc.getNano()));





     }

}
