import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double Wartosc;
        System.out.println("Podaj Wartość kupowanego produktu: ");
        Wartosc = klawiatura.nextDouble();
        klawiatura.nextLine();
        double PodatekS = 0.04;  //4%
        double PodatekL = 0.02;  //2%

        double wartoscPodatekS = (Double)PodatekS * Wartosc;
        double wartoscPodatekL = (Double)PodatekL * Wartosc;
        double CenaSprzedazy = (double)wartoscPodatekL + Wartosc + wartoscPodatekS;

        System.out.println("Wartość produktu wynosi: " + Wartosc + "zł");
        System.out.println("Wartość podatku Stanowego wynosi: " + wartoscPodatekS + "zł");
        System.out.println("Wartość podatku Lokalnego wynosi: " + wartoscPodatekL + "zł");
        System.out.println("Łączna wartość ceny sprzedaży wynosi: " + CenaSprzedazy + "zł");





    }
}
