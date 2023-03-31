public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 4;
        arr[0][2] = 12;

        arr[1][0] = 0;
        arr[1][1] = 7;
        arr[1][2] = 14;

        arr[2][0] = 0;
        arr[2][1] = -5;
        arr[2][2] = 2;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}


