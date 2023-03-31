public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        ++x;
        y++;
        System.out.println("++x = "+x);
        System.out.println("y++ = "+y);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println();
        System.out.println();


        float w = 52.4f;
        float z = 22.2f;
        float suma = w + z;
        float odej = w - z;
        float mno = w * z;
        float dzi = w / z;
        float mod = w % z;
        System.out.println("w = "+w);
        System.out.println("z = "+z);
        System.out.println("w + z = " + suma);
        System.out.println("w - z = " + odej);
        System.out.println("w * z = " +  mno);
        System.out.println("w / z = " + dzi);
        System.out.println("w % z = " + mod);
        System.out.println();
        System.out.println();

        int m = 14;
        int n = -12;
        int o = 42;
        boolean rowne = m == n;
        boolean nrowne = m != n;
        boolean wieksze = m > n;
        boolean mniejsze = m < n;
        boolean wiekszero = m >= n;
        boolean mniejszero = m <= n;
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        System.out.println("o = "+o);
        System.out.println("m < n = " + rowne);
        System.out.println("m > n = " + nrowne);
        System.out.println("n =< o = " + wieksze);
        System.out.println("m >= n = " + mniejsze);
        System.out.println("n == 0 = " + wiekszero);
        System.out.println("m != o = " + mniejszero);

    }
}