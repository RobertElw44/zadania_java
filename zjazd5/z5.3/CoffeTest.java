import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CoffeTest {
    public static void main(String[] args) {


        System.out.println();
        List<String> automat = new ArrayList<>();
        automat.add("espresso");
        automat.add("latte");
        automat.add("cappucino");
        automat.add("mocha");
        automat.add("auLait");
        automat.add("macchiato");

        System.out.println("Automat: ");
        System.out.println("[Opcje do wyboru]");
        System.out.println();

        Iterator<String> iterator = automat.iterator();
        while (iterator.hasNext()) {
            String x = iterator.next();
            System.out.println("==> " +x);
        }

        System.out.println();


        for (String x : automat) {
            System.out.println(x.toUpperCase());
        }


        System.out.println();
        for(String x : automat) {

            System.out.println(x.substring(0, 4));
            continue;
        }



    }
}
