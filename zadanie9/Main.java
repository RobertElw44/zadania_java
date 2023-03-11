import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Wpisz zdanie do sprawdzenia: ");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String sentence = scanner.nextLine();
            if (sentence.equals("koniec")) {
                break;
            }

            boolean czypalindrom = true;

            for (int i = 0; i < sentence.length() / 2; i++)
            {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != otherChar) {
                    czypalindrom = false;
                    break;
                }
            }
            if (czypalindrom)
            {
                System.out.println("TAK");
            } else
            {
                System.out.println("NIE");
            }

        }
    }
}