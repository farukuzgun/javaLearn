package JAVA_LEARN.j15_Arrays.Tasks_Arrays2;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int num []={15 , 25, 22, 18, 30};
        Arrays.sort(num);
        System.out.println("second big = " + (num[num.length - 2]));

    }
}
