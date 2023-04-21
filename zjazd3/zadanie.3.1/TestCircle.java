//Zadanie 3.1a
import java.lang.Math;
public class TestCircle { //Zadanie 3.1b
    public static void main(String[] args) {

        Circle kolo = new Circle();
        Circle koleczko = new Circle(2.7);

        System.out.println("Kolo1: ");
        System.out.println("Promień: " + kolo.getRadius());
        System.out.println("Pole: " + kolo.getArea());
        System.out.println();
        System.out.println("Kolo2: ");
        System.out.println("Promien: "+ koleczko.getRadius());
        System.out.println("Pole: "+ koleczko.getArea());

        //Zadanie 3.1c
        Circle kolo3 = new Circle(7.8, "red");
        System.out.println();
        System.out.println("Kolo3: ");
        System.out.println("Promień: "+ kolo3.getRadius());
        System.out.println("Pole: "+ kolo3.getArea());

        //Zadanie 3.1d
        Circle kolo4 = new Circle();

        kolo4.setRadius(15.2);
        kolo4.setColor("black");

        System.out.println();
        System.out.println("Kolo4: ");
        System.out.println("Promień:  " + kolo4.getRadius());
        System.out.println("Kolor:  " + kolo4.getColor());


        //Zadanie 3.1e

        System.out.println();
        System.out.println("1. " +kolo.toString());
        System.out.println();
        System.out.println("2. " +koleczko.toString());
        System.out.println();
        System.out.println("3. " +kolo3.toString());
        System.out.println();
        System.out.println("4. " +kolo4.toString());
    }
}
class Circle{       //zmienne
    private double radius;
    private String color;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }


    // przeciazam konstruktory

    public Circle(){
        this.radius = 5.2;
        this.color = "blue";

    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";
    }

    public String getColor(){
        return this.color;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public  double getArea(){
        double pole = Math.PI * (radius*radius);
        return pole;
    }

    public String toString() {
        return "Circle: radius = " + radius + "  |  color = " + color;
    }

}
