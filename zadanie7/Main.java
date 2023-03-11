import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę elementów pierwszej tablicy:");
        int n = input.nextInt();
        int[] A = new int[n];
        System.out.println("Podaj elementy pierwszej tablicy:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Podaj liczbę elementów drugiej tablicy:");
        int m = input.nextInt();
        int[] B = new int[m];
        System.out.println("Podaj elementy drugiej tablicy:");
        for (int i = 0; i < m; i++) {
            B[i] = input.nextInt();
        }

        int iloczyn = 0;
        int mniejszyRozmiar = Math.min(n, m);

        for (int i = 0; i < mniejszyRozmiar; i++) {
            iloczyn += A[i] * B[i];
        }

        System.out.println("Iloczyn skalarny: " + iloczyn);
        }
    }

