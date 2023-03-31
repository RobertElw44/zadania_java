import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        char stala = 'N';
        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Odgadnij ją: ");

        int bajt = System.in.read();
        char litera = (char) bajt;

        if (litera == stala){
            System.out.println("Dobrze!");
        } else if(stala < litera) {
            System.out.println("Źle! ");
            System.out.println("Trafiłeś zbyt wysoko! ");
        }else if(stala > litera){
            System.out.println("Źle! ");
            System.out.println("Trafiłeś zbyt nisko! ");
        }

    }
}