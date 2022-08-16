package JAVA_82.day09_Ternary_Switch;


public class C05_Switch_Case_2 {
    public static void main(String[] args) {

        // gün ismini alalım
        // haftaiçi - haftasonu olduğunu yazdırlaım

        String input = "pazarteSi";
        input=input.toLowerCase();


        switch (input) {

            case "pazartesi":
                System.out.println("Hafta içi");
                break;
            case "salı":
                System.out.println("Hafta içi");
                break;
            case "çarşamba":
                System.out.println("Hafta içi");
                break;
            case "perşembe":
                System.out.println("Hafta içi");
                break;
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
                System.out.println("Hafta Sonu");
                break;
            case "pazar":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Geçerli Bir Gün Girin");
                break;

        }

        switch (input) {

            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Geçerli Bir Gün Girin");
                break;

        }


    }
}
