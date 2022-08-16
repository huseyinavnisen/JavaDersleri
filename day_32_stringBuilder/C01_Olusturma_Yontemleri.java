package JAVA_82.day_32_stringBuilder;

public class C01_Olusturma_Yontemleri {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder(); // tip 1
        StringBuilder sb2=new StringBuilder("Java Candır"); // tip 2
        StringBuilder sb3=new StringBuilder(10); // tip 3

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16  kapasite belitmezsek 16 karakter hazır hale getirir.

        System.out.println(sb2.length()); // 11
        System.out.println(sb2.capacity()); // 27

        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 10

        sb1.append("Java");
        System.out.println(sb1.length()); // 4
        System.out.println(sb1.capacity()); // 16

        sb1.append("Candır Cannn Vay be  asdasdasndkl   dla hdlas  dasdf fsf fsfsdfsdf sd f f fsdf sdf sdf sdf sdld l d  dgdf gdfgdf dfgdf gdfg dfg dfg   gdgdfgfgd gdfgdfgdfda dald als d  dasdasgdfgd");
        System.out.println(sb1.length()); // 23 --- 16'yı geçti
        System.out.println(sb1.capacity()); // 34  ( 16 * 2 + 2 )

        StringBuilder sb4=new StringBuilder();
       sb4.append("Java Candır");
        System.out.println(sb4.length()); // 11
        System.out.println(sb4.capacity()); // 16

    }
}
