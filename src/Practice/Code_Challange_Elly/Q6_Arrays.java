package Practice.Code_Challange_Elly;

public class Q6_Arrays {
    public static void main(String[] args) {
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int arr1 [][] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2 [][] = { {-7,6,-9}, {0,12}, {19} };


        System.out.println(arrtoplam(arr1) + arrtoplam(arr2));


    }

    private static int arrtoplam(int[][] arr1) {
        int toplam=0;
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                toplam+=arr1[i][j];

            }

        }
        return toplam;
    }
}
