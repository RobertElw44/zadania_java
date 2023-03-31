// Zadanie 2.13
public class VehicleProg {
    public static void main(String[] args) {

        Vehicle miniVan = new Vehicle(7, 60, 8);
        Vehicle sportsCar = new Vehicle(2, 50, 12);
        int range = miniVan.getRange();
        int range2 = sportsCar.getRange();
        System.out.println("Mini van przewozi " + miniVan.getPassengers() + " osób na odległość do " + range + " km");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odległość do " + range2 + " km");

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

    public int getRange() {

        int range = (tankCapacity * 100) / fuelConsumption;
        return range;
    }
    public int getPassengers() {
        return passengers;
    }
}

