package JAVA_LEARN.j12_Loops.L01_ForLoop.hw_loop;

public class Odev04 {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        //Kodu aşağıya yazınız.

        for (int i = 0; i<101 ; i++){
            if (i%5==0 && i%4==0){
                System.out.print(i+", ");
            }
        }




    }
}
