import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(50);
        long startTime = System.currentTimeMillis();
        
        for(int i = 2; i <= 100; i+=2)
            lista.add(i);

        for (int i = 0; i < lista.size(); i++)
            System.out.println("Numer indeksu [" + i + "]:" + " " + lista.get(i));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();
        System.out.println("Czas całej operacji: " + totalTime + "  milisekund");

    }
}
