package service;

public class KontoBankowe implements OperacjeBankowe {
    private double saldo;

    public KontoBankowe(double saldoPoczatkowe) {
        saldo = saldoPoczatkowe;
    }

    public void wyplata(double amount) {
        if (amount > saldo) {
            System.out.println("Nie masz wystarczających środków na koncie.");
        } else {
            saldo -= amount;
            System.out.println("Wypłacono: " + amount + " [PLN]");
        }
    }

    public void wplata(double amount) {
        saldo += amount;
        System.out.println("Wpłacono: " + amount + " [PLN]");
    }

    public double getSaldo() {
        return saldo;
    }
}
