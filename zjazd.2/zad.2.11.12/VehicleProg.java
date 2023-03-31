// zadanie 2.11 2.12
public class VehicleProg {
    public static void main(String[] args) {

        Vehicle miniVan = new Vehicle(7, 60, 8);
        Vehicle sportsCar = new Vehicle(2, 50, 12);

        System.out.println("Minivan przewozi: " + miniVan.getPassengers() + " osób.");
        System.out.println("Zasięg (km): " + miniVan.calculateRange() + " km");
        System.out.println("Auto sportowe przewozi: " + sportsCar.getPassengers() + " osób.");
        System.out.println("Zasięg (km): " + sportsCar.calculateRange() + " km");
    }
}

class Vehicle {
    private int passengers;
    private int tankCapacity;
    private int fuelConsumption;

    public Vehicle(int passengers, int tankCapacity, int fuelConsumption) {
        this.passengers = passengers;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public int calculateRange() {

        int range = (tankCapacity * 100) / fuelConsumption;
        return range;
    }
    public int getPassengers() {
        return passengers;
    }
}

