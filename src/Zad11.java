import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double przejechanekilometry;
        System.out.println("podaj ilość przjechanych kilometrów: " );
        przejechanekilometry = klawiatura.nextDouble();
        klawiatura.nextLine();

        double zuzyteLitryPaliwa;
        System.out.println("podaj ilosc zużytych litrów paliwa");
        zuzyteLitryPaliwa = klawiatura.nextDouble();
        klawiatura.nextLine();
        double przejechaneKmNalitr = przejechanekilometry / zuzyteLitryPaliwa;
        System.out.println(przejechaneKmNalitr);

    }
}
