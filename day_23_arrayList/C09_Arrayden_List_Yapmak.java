package JAVA_82.day_23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_Arrayden_List_Yapmak {
    public static void main(String[] args) {

        // list teki en kötü özelliği elemanları tek tek girmek lazım

        int [] arr ={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        // bu dizideki tüm elamnları Liste eklemek çok zordur.For - loop ile yapabiliriz.


        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            list1.add(arr[i]);
        }

        System.out.println(list1);  // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        bu işlemi yapması için javanın oluşturduğu bir method da var
        ancak bu yöntemi ÇOK YAN ETKİSİ var
        1 - Bu şekilde diziden Liste dönüşen liste de add, remove gibi methodlar kullanılamaz.
        2 - asList methodu ile oluşturulan liste ve kaynak olan array biribiri ile ilişik olarak
        hayatlarına devam ederler. Birinde yapılan değişiklik otomatik olarak diğerine de işler.

                */

       //  List<Integer> sayilar2 = Arrays.asList(arr); // dizi int[] olduğu için hata veriyor

        Integer [] dizi ={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        List<Integer> List2 = Arrays.asList(dizi);
        System.out.println(List2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        list1.add(5);
        System.out.println(list1); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]








    }
}
