import java.util.Scanner;

public class Zad12 {

    public static void main(String[] args) {


        int porcjawpudelko = 10 ;
        int kalorienaporcje = 300;
        int ciastekPudelko = 40;
        int kalorienaciastko =  kalorienaporcje/ (ciastekPudelko / porcjawpudelko) ;
        Scanner klawiatura = new Scanner(System.in);
        int zjedzoneciastka;
        System.out.println("podaj ilość zjedzonych ciastek: ");
        zjedzoneciastka = klawiatura.nextInt();
        klawiatura.nextLine();

        int kalorienazjedzoneciastko = zjedzoneciastka * kalorienaciastko;
        System.out.println("zjedzone ciastka posiadają " + kalorienazjedzoneciastko + "kalorii.");







    }
}