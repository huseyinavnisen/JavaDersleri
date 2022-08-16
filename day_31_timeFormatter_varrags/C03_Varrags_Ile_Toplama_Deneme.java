package JAVA_82.day_31_timeFormatter_varrags;

public class C03_Varrags_Ile_Toplama_Deneme {
    // verilen kaç integer olursa olsun toplayıp sonucu yazdıran method oluşturun
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int s3 = 30;
        int s4 = 40;
        int s5 = 50;
        System.out.println(topla(s1, s2, s3,s4,s5));

    }

    private static int topla(int... s) {
        int top = 0;
        for (int i = 0; i < s.length; i++) {
            top += s[i];
        }
        return top;
    }
}



