package service;

public interface OperacjeBankowe {
    void wyplata(double amount);

    void wplata(double amount);
    double getSaldo();
}


