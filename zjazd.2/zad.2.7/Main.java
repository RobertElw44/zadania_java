import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj promień walca: ");
        int r = we.nextInt();
        System.out.println("Podaj wysokość walca: ");
        int h = we.nextInt();
        double v = Math.PI *(r*r)*h;
        System.out.println("Pojemność walca wynosi "+v);
    }
}