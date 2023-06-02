package entry;

public class Bankomat {
    private static double liczbaGotowki = 120000;

    public static double getLiczbaGotowki() {
        return liczbaGotowki;
    }

    public static void zwiekszGotowke(double amount) {
        liczbaGotowki += amount;
    }

    public static void zmniejszGotowke(double amount) {
        liczbaGotowki -= amount;
    }
}
