import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class BookTest {
    public static void main(String[] args) {

        KsiazkaPapierowa book1 = new KsiazkaPapierowa("Władca Pierścieni", "J.R.R. Tolkien", 1000, 1954);
        Ebook book2 = new Ebook("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 300, "PDF", 1024);
        KsiazkaPapierowa book3 = new KsiazkaPapierowa("Metro 2033", "Dmitry Glukhovsky", 400, 2005);
        Ebook book4 = new Ebook("Dziady cz. III", "Adam Mickiewicz", 150, "EPUB", 512);
        KsiazkaPapierowa book5 = new KsiazkaPapierowa("Człowiek w wysokim zamku", "Philip K. Dick", 250, 1962);


        List<Ksiazka> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        books.sort(Comparator.comparing(Ksiazka::getTytul));


        for (Ksiazka book : books) {
            System.out.println(book.getTytul() + " - " + book.getAutor());
        }
    }
        
}
class Ksiazka {
    String tytul;
    String autor;
    int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}
class Ebook extends Ksiazka{
    int rozmiar;
    String format;

    public Ebook(String tytul, String autor, int liczbaStron, String format, int rozmiar) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
class KsiazkaPapierowa extends Ksiazka {
    int rokWydania;

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
