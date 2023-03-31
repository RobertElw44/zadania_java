public class Main {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        if(str1 == str2) {
            System.out.println("str1 == str2: ");
            System.out.println("true");
            System.out.println();
        } else {
            System.out.println("Roznia sie");
        }

        if(str1.equals(str2)) {
            System.out.println("str1.equals(str2): ");
            System.out.println("true");

        } else {
            System.out.println("Roznia sie");
        }

    }
}