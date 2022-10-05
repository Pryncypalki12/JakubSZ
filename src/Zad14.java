import java.util.Scanner;

public class Zad14 {

    public static void main(String[] args) {

        double marza = 0.4; //40%

        Scanner klawiatura = new Scanner(System.in);
        int cena;
        System.out.println("podaj cene detaliczną: ");
        cena = klawiatura.nextInt();
        klawiatura.nextLine();

        double zysk = (double)cena * marza;
        System.out.println("zysk wynosi: " + zysk + "zł");
        }


}


