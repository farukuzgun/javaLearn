package JAVA_LEARN.j09_Switch_Statement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

// Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner dat = new Scanner(System.in);
        System.out.println("ay numarası giriniz= ");
        int ay = dat.nextInt();

        switch (ay) {
            case 1: case 3: case 5: case 7: case 9: case 10: case 12:
                System.out.println("31 gün");
                break;
            case 4: case 6: case 8: case 11:
                System.out.println("30 gün");
                break;
            case 2:
                System.out.println("yıl giriniz= ");
                int yil = dat.nextInt();
                if (yil%4==0)
                System.out.println("28 gün");
                else System.out.println("29 gün");
                break;
            default:
                System.out.println("bu sırada bir ay yok");

        }






        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.print("yılınızı giriniz : ");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girilen ay subat ayı 29 gün içerir ");
                } else System.out.println("girilen ay subat ayı 28 gün içerir");
                break;
            default:
                System.out.println("adam gibi bişey gir :( ");

         */

        }


               }
