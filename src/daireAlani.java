import java.util.Scanner;
public class daireAlani {
    public static void main (String[] args){

        double pi =3.14, r, alan, cevre, a;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Yazınız : ");
        r = input.nextDouble();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.print("Dairenin Merkez Açısını Yazınız : ");
        a = input.nextDouble();

        System.out.println("Dairenin Alanı = " + alan);
        System.out.println("Dairenin Çevresi = " + cevre);
        System.out.print("Daire Diliminin Alanı = " + (pi*(r*r)*a)/360);

    }
}
