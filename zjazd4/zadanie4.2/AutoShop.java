
public class AutoShop {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(24500, 18);
        Ford ford1 = new Ford(33999, 2019, 5000);
        Ford ford2 = new Ford(27260, 2018, 3000);
        Truck truck = new Truck(90000, 2500);

        System.out.println();
        System.out.println(sedan.getPurchaseInfo() + " " + sedan.getSalePrice());
        System.out.println(ford1.getPurchaseInfo() + " " + ford1.getSalePrice());
        System.out.println(ford2.getPurchaseInfo() + " " + ford2.getSalePrice());
        System.out.println(truck.getPurchaseInfo() + " " + truck.getSalePrice());
    }
}

interface Purchase {
    String getPurchaseInfo();
}

class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

class Sedan extends Car implements Purchase {
    int length;

    public Sedan(double regularPrice, int length) {
        super(regularPrice);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.9;
        }
    }

    public String getPurchaseInfo() {
        return getClass().getSimpleName();
    }
}

class Ford extends Car implements Purchase {
    int year;
    int manufacturerDiscount;

    public Ford(double regularPrice, int year, int manufacturerDiscount) {
        super(regularPrice);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    public String getPurchaseInfo() {
        return getClass().getSimpleName();
    }
}

class Truck extends Car implements Purchase {
    int weight;

    public Truck(double regularPrice, int weight) {
        super(regularPrice);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice();
        }
    }

    public String getPurchaseInfo() {
        return getClass().getSimpleName();
    }
}


