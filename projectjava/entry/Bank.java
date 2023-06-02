package entry;

import java.util.Scanner;
import service.KontoBankowe;
import service.OperacjeBankowe;

public class Bank implements OperacjeBankowe {
    private static final String CORRECT_PIN = "4321";
    private static final int MAX_CHANCES = 3;

    private final KontoBankowe konto;

    private int liczbaProb;
    private boolean bankomatZablokowany;

    public Bank(double saldoPoczatkowe) {

        konto = new KontoBankowe(saldoPoczatkowe);

        liczbaProb = 0;
        bankomatZablokowany = false;
    }

    public void wyplata(double amount) {
        if (bankomatZablokowany) {
            System.out.println("Bankomat jest zablokowany. Przepraszamy za problemy.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Podana kwota wyplaty jest nieprawidłowa.");
            return;
        }

        if (amount > Bankomat.getLiczbaGotowki()) {
            System.out.println("Przepraszamy! Bankomat nie posiada wystarczającej ilości gotówki.");
            return;
        }

        if (amount > konto.getSaldo()) {

            double maxkwotawyplaty = Math.min(konto.getSaldo(), Bankomat.getLiczbaGotowki());

            System.out.println("Brak wystarczających środków w sejfie. Proponowana wypłata w niższej kwocie.");
            System.out.println("Możesz wypłacić maksymalnie: " + maxkwotawyplaty + " [PLN]");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Czy wyrażasz zgodę na wypłatę w tej kwocie? Wybierz [Tak/Nie]: ");
            String wybor = scanner.nextLine();

            if (wybor.equalsIgnoreCase("Tak")) {
                amount = maxkwotawyplaty;
            } else {
                System.out.println("Wypłata anulowana. ");
                return;
            }
        }


        Bankomat.zmniejszGotowke(amount);
        konto.wyplata(amount);
        System.out.println("Transakcja zakończona pomyślnie.");

    }

    public void wplata(double amount) {
        if (bankomatZablokowany) {
            System.out.println("Bankomat jest zablokowany. Przepraszamy za problemy.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Podana kwota wpłaty jest nieprawidłowa.");
            return;
        }

        Bankomat.zwiekszGotowke(amount);
        konto.wplata(amount);
        System.out.println("Transakcja zakończona pomyślnie.");
    }


    public double getSaldo() {
        return konto.getSaldo();
    }


    public void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Włóż kartę płatniczą (Wciśnij Enter, aby włożyć kartę): ");
        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            System.out.println("Nieprawidłowe wsadzenie karty.");

        } else {
            while (liczbaProb < MAX_CHANCES) {
                System.out.print("Wprowadź numer PIN: ");
                String pin = scanner.nextLine();

                if (checkPIN(pin)) {
                    System.out.println("PIN poprawny. Dostęp udzielony.");
                    serviceBank();

                    break;

                } else {

                    liczbaProb++;
                    System.out.println("PIN niepoprawny. Pozostałe próby: " + (MAX_CHANCES - liczbaProb));
                }
            }

            if (liczbaProb == MAX_CHANCES) {
                System.out.println("Przekroczono maksymalną liczbę prób. Karta zostaje zablokowana.");
                lockBank();
            }
        }
    }

    private boolean checkPIN(String pin) {
        return pin.equals(CORRECT_PIN);
    }

    private void serviceBank() {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.println();
            System.out.println("=== Menu Bankomatu ====");
            System.out.println("= " +"[1] Sprawdź saldo" + "   =");
            System.out.println("= " +"[2] Wypłata" + "         =");
            System.out.println("= " +"[3] Wpłata" + "          =");
            System.out.println("= " + "[4] Zakończ" + "         =");
            System.out.println("=======================");
            System.out.print("Wybierz opcję: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.println();
                    System.out.println("=======================");
                    System.out.println("Saldo: " + konto.getSaldo());
                    System.out.println("=======================");

                    break;
                case 2:

                    System.out.println();
                    System.out.println("=======================");
                    System.out.println("Podaj kwotę do wyplaty: ");
                    System.out.println("=======================");
                    System.out.print("[PLN]:  ");
                    double amount = scanner.nextDouble();
                    wyplata(amount);

                    break;
                case 3:

                    System.out.println();
                    System.out.println("=======================");
                    System.out.println("Podaj kwotę do wpłaty: ");
                    System.out.println("=======================");
                    System.out.print("[PLN]:  ");
                    amount = scanner.nextDouble();
                    wplata(amount);

                    break;
                case 4:

                    menu = false;

                    break;
                default:

                    System.out.println();
                    System.out.println("Nieprawidłowa opcja.");

                    break;
            }
        }
    }

    private void lockBank() {
        bankomatZablokowany = true;
    }
}
