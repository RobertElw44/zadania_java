import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe: ");
        double a = scanner.nextDouble();
        System.out.println("Wpisz liczbe: ");
        double b = scanner.nextDouble();
        System.out.println("Wpisz liczbe: ");
        double c = scanner.nextDouble();

        if(a>b && a>c && b>c)  // a b c
        {
            System.out.print(a + "  ");
            System.out.print(b + "  ");
            System.out.print(c + "  ");
            System.out.println();
            System.out.print(c + "  ");
            System.out.print(b + "  ");
            System.out.print(a + "  ");
        } else if (b>a && b>c && a>c )  // b a c
        {
            System.out.print(b + "  ");
            System.out.print(a + "  ");
            System.out.print(c + "  ");
            System.out.println();
            System.out.print(c + "  ");
            System.out.print(a + "  ");
            System.out.print(b + "  ");
        } else if (c>a && c>b && a>b) // c a b
        {
            System.out.print(c + "  ");
            System.out.print(a + "  ");
            System.out.print(b + "  ");
            System.out.println();
            System.out.print(b + "  ");
            System.out.print(a + "  ");
            System.out.print(c + "  ");
        } else if (c>a && c>b && b>a) // c b a
        {
            System.out.print(c + "  ");
            System.out.print(b + "  ");
            System.out.print(a + "  ");
            System.out.println();
            System.out.print(a + "  ");
            System.out.print(b + "  ");
            System.out.print(c + "  ");
        } else if (b>a && b>c && c>a )  // b c a
        {
            System.out.print(b + "  ");
            System.out.print(c + "  ");
            System.out.print(a + "  ");
            System.out.println();
            System.out.print(a + "  ");
            System.out.print(c + "  ");
            System.out.print(b + "  ");
        } else if(a>b && a>c && c>b)  // a c b
        {
            System.out.print(a + "  ");
            System.out.print(c + "  ");
            System.out.print(b + "  ");
            System.out.println();
            System.out.print(b + "  ");
            System.out.print(c + "  ");
            System.out.print(a + "  ");
        }
    }
}