package JAVA_82.day_35_inheritanceConstractorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    extends kullanılan claslarda ister default const bulunsun istersekte biz
    parametreli const(lar) oluşturalım. Java const'in ilk satırına
    super(); const call yazar.
    super() const call, default cons benzer yani görümez ama vardır ve çalışır
    ancak biz ilk satıra farklı bir contr call yazarsak super() constr siler.

eğer biz müdahele edip kendi constractorumuzu oluşturmazsak
javanın default constractoru parametresiz super() constrctur dur.

     */



    FMemur() {
        System.out.println("Memur Parametresiz Constractor");
    }

    FMemur(String isim) {
        System.out.println("Memur Parametreli Constractor");
    }

    public static void main(String[] args) {

        FMemur mm1 = new FMemur("Aloo");
       // FMemur mm2 = new FMemur("Merhaba");
       // EMuhasebe em1 = new EMuhasebe("Hasan");
    }

}

