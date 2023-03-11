import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Wpisz bok A:");

        Scanner scanner = new Scanner(System.in);
        double boka = scanner.nextDouble();

        System.out.println("Wpisz bok B:");

        double bokb = scanner.nextDouble();
        double c = boka * bokb;

        System.out.println(c);
    }
}