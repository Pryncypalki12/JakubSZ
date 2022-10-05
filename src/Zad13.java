import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int test1;
        System.out.println("podaj Wynik 1 testu: ");
        test1 = klawiatura.nextInt();
        klawiatura.nextLine();


        int test2;
        System.out.println("podaj Wynik 2 testu: ");
        test2 = klawiatura.nextInt();
        klawiatura.nextLine();



        int test3;
        System.out.println("podaj Wynik 3 testu: ");
        test3 = klawiatura.nextInt();
        klawiatura.nextLine();

        double ilosctestow = 3;

        System.out.println("Wynik pierwszego testu to: " +test1);
        System.out.println("Wynik drugiego testu to: " +test2);
        System.out.println("Wynik trzeciego testu to: " +test3);
        double srednia =(test1 + test2 + test3) / (double)ilosctestow;
        System.out.println("srednia wynosi: " + srednia);
    }
}
