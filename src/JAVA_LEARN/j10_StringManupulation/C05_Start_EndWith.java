package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {


        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("t", 2));//true 3. indexten itibaren strin a ile mi başlar

        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        int yas=48;
        // System.out.println(sehir.endsWith(yas));// cte

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

        Scanner dat = new Scanner(System.in);
        System.out.println("lütfen bir gmail hesabı giriniz: ");
        String e = dat.nextLine();
        if (e.endsWith("@gmail.com")){
            System.out.println("hesabınız onaylandı");}
        else System.out.println("geçerli hesap giriniz");

        }

    }





