import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz bok A:");
        double a = scanner.nextDouble();
        System.out.println("Wpisz bok B:");
        double b = scanner.nextDouble();
        System.out.println("Wpisz bok C:");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}