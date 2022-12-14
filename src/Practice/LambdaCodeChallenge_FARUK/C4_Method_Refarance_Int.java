package Practice.LambdaCodeChallenge_FARUK;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL = Arrays.asList(-2, -8, -5, 0, 2, 5, 6, 7, 15, 6, 8);


        // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
        System.out.print("Tek sayılar: ");
        intL.stream().filter(x->x%2!=0).forEach(x-> System.out.print(x+" "));
        System.out.println();

        // S2: ciftlerin carpimini bulalim
        System.out.print("Çiftlerin çarpımı: ");
        System.out.println(intL.stream().filter(Methods_F::ciftMi).filter(x->x!=0).reduce(Methods_F::carpAll));
        System.out.println();

        // S3: negatiflerin kare toplamlarini  bulalim
        System.out.println("\nnegatifKareToplam(intL) = " + negatifKareToplam(intL));

        // S4: poziflerin kuplerinden max olani yazdiralim
        System.out.println(poziKüpMax(intL));

    }

    private static Optional<Integer> poziKüpMax(List<Integer> intL) {

    return intL.stream().filter(Methods_F::pozitifMi).map(Methods_F::kupBul).reduce(Math::max);
    // intL.stream().filter(Methods_F::pozitifMi).map(Methods_F::kupBul).reduce(Integer::max);

    }

    private static Optional<Integer> negatifKareToplam(List<Integer> intL) {

    return intL.stream().filter(Methods_F::negatifMi).map(Methods_F::kareBul).reduce(Methods_F::toplam);
    }
}