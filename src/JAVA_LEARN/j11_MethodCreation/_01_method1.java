package JAVA_LEARN.j11_MethodCreation;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {


        System.out.println("random: "+randomNum());
    }

    public static int randomNum() {
    Scanner dat = new Scanner(System.in);
        System.out.println("random değer almak için max değer giriniz= ");
        int max = dat.nextInt();
        int val = (int)(Math.random()*max);
        return val;

}}
