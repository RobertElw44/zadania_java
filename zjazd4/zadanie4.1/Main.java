class TestCircleAndCylinder {
    public static void main(String[] args) {


        Circle c1 = new Circle();
        System.out.println("CIRCLE 1:");
        System.out.println(c1.toString());
        System.out.println();
        System.out.println("(r) radius: " + c1.getRadius());
        System.out.println("(P) area: " + c1.getArea());
        System.out.println();

        Circle c2 = new Circle(5.0);
        System.out.println("CIRCLE 2:");
        System.out.println(c2.toString());
        System.out.println();
        System.out.println("(r) radius: " + c2.getRadius());
        System.out.println("(P) area: " + c2.getArea());
        System.out.println();

        Cylinder cy1 = new Cylinder();
        System.out.println("CYLINDER 1:");
        System.out.println(cy1.toString());
        System.out.println();
        System.out.println("(r) radius: " + cy1.getRadius());
        System.out.println("(H) height: " + cy1.getHeight());
        System.out.println("(V) volume: " + cy1.getVolume());
        System.out.println();

        Cylinder cy2 = new Cylinder(8.0);
        System.out.println("CYLINDER 2:");
        System.out.println(cy2.toString());
        System.out.println();
        System.out.println("(r) radius: " + cy2.getRadius());
        System.out.println("(H) height: " + cy2.getHeight());
        System.out.println("(V) volume: " + cy2.getVolume());
        System.out.println();

        Cylinder cy3 = new Cylinder(6.0, 10.0);
        System.out.println("CYLINDER 3:");
        System.out.println(cy3.toString());
        System.out.println();
        System.out.println("(r) radius: " + cy3.getRadius());
        System.out.println("(H) height: " + cy3.getHeight());
        System.out.println("(V) volume: " + cy3.getVolume());
    }
}
class Circle {
    protected double radius;
    protected String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "(r)= " + this.radius + ", (color)= " + this.color;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 4.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 4.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    public String toString() {
        return "(r)= " + this.radius + ", (H)= " + this.height + ", (color)= " + this.color;
    }
}


