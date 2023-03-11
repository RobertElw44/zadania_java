import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Podaj liczbę naturalną n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("BŁĄD: Podana wartość nie jest liczbą całkowitą.");
                scanner.nextLine();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}