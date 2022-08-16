package JAVA_82.day_32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Daha Ne Yapsın");
        sb.append("?");
        System.out.println(sb); // Java Daha Ne Yapsın? == > append Stringin sonuna ekler...

        sb.append(5);
        System.out.println(sb); //Java Daha Ne Yapsın?5

        sb.append(true);
        System.out.println(sb); //Java Daha Ne Yapsın?5true

        sb.insert(4," Herşeyi Düşünmüş");
        System.out.println(sb); // Java Herşeyi Düşünmüş Daha Ne Yapsın?5true





    }
}
