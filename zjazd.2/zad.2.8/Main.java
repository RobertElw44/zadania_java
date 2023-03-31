public class Main {
    public static void main(String[] args) {

        boolean P, Q;
        System.out.println("P       Q       AND     OR      XOR     NOT");
        P = true; Q = true;
        System.out.print(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        System.out.println();
        P = true; Q = false;
        System.out.print(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        System.out.println();
        P = false; Q = true;
        System.out.print(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        System.out.println();
        P = false; Q = false;
        System.out.print(P + "\t" + Q + "\t" + (P && Q) + "\t" + (P || Q) + "\t" + (P ^ Q) + "\t" + !P);
        System.out.println();

    }
}