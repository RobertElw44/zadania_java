import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj grupę: ");
        String grupa = scanner.nextLine();
        System.out.println("Podaj kierunek: ");
        String kierunek = scanner.nextLine();

        System.out.println("imię: " +name);
        System.out.println("nazwisko: " +nazwisko);
        System.out.println("grupa: " +grupa);
        System.out.println("kierunek: " +kierunek);
    }
}
