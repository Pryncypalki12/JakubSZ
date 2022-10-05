public class Zad6 {
    public static void main(String[] args) {
        int pokoj1 = 3 * 4;
        int pokoj2 = 3 * 4;
        int pokoj3 = 2 * 3;
        int pokoj4 = 2 * 2;
        int powierzchnia = pokoj1 + pokoj2 + pokoj3
                + pokoj4;
        int osoby = 4;
        int PowierzchniaNaJednaOsobe = powierzchnia / osoby;

        System.out.println(PowierzchniaNaJednaOsobe);
    }
}