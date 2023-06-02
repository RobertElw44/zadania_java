package main;

import entry.Bank;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(85000.0);
        bank.start();
    }
}

