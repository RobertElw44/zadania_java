import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz dwa ciagi wyrazowe: ");

        String napis1 = scanner.next();

        String napis2 = scanner.next();

        String wynik = "%" + napis2 + " " + napis1 + "%";

        System.out.println(wynik);
    }
}