package JAVA_82.day_15_Overloading_For_Loop;

public class c02_OverLoading {
    public static void main(String[] args) {
         /*
         Java'da oluşturduğumuz methodun yaptığı işi çağrıştırısa iyi olur
         substring () replace()
          */

   String str="Java ahhh Java";

   str.substring(2); // bu başka bir method (substring) ctrl ile tıkla gör
   str.substring(3,4);  // bu başka bir method (substring)

   str.replace('J','K');
   str.replace("a","l");

//  AYNI İSİMDE farklı methodlar oluşturmak için
        //1 - Parametre sayısı değiştirilebilir.
        // 2 - Aynı sayıda parametre var ise parametre data türlerini değiştirebiliriz.
        // 3 - Aynı sayıda parametre ve Data türünde ise parametrelerin sıralanışı ile değiştirebiliriz.


    }



}
