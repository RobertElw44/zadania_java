public class Main {
    public static void main(String[] args) {
        Author ator = new Author("Robert", "Elwart", 22);

        System.out.println();
        System.out.println(ator.toString());
        System.out.println();
        ator.setSurname("Nowak");
        System.out.println("Imię: "+ator.getName() + " Nazwisko: "+ator.getSurname() +"  Wiek: "+ ator.getAge());
        System.out.println();
        ator.setSurname("Kowalczyk");
        System.out.println("Imię: "+ator.getName());
        System.out.println("Nazwisko: "+ator.getSurname());
        System.out.println("Wiek: "+ ator.getAge());

        System.out.println();
        System.out.println("Imię: "+ator.getName() + "  " + "Wiek: "+ ator.getAge());
    }
}
class Author{
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String toString() {
        return "Imię Autora: " + name + "  Nazwisko: " + surname + ",  Wiek: " +age;
    }

}