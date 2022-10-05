import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String nazwa;
        System.out.println("podaj nazwe miasta: ");
        nazwa = klawiatura.next();
        klawiatura.nextLine();

        int dlugosc;
        dlugosc = nazwa.length();

        String duze ,male;

        duze = nazwa.toUpperCase();

        male = nazwa.toLowerCase();

        char pierwszyznak = nazwa.charAt(0);
        System.out.println("ilośc znaków wynosi: " + dlugosc);
        System.out.println("nazwa miasta dużymi literami: " + duze);
        System.out.println("nazwa miasta małymi literami: " + male);

    }
}
