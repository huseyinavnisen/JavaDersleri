package JAVA_82.day_43;

public class C02_Child  implements I01_InterfaceBodyOlanMethod{
    // akü metodu var ama bodyy var. onları önemsenez.
    // ister implement et şster etme
    //  ammmaa bodysi olmayan methotları mutlaka implement ederiz


    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon(); // direksiyon staticdir
        C02_Child obj=new C02_Child();
        obj.teker();
    }
}
