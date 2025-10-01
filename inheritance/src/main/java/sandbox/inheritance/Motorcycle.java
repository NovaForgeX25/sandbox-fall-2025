package sandbox.inheritance;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;
    private double mpg;

    // Corrected constructor
    public Motorcycle(String brand, String model, int year, double fuelCapacity, boolean hasSidecar, double mpg) {
        super(brand, model, year, fuelCapacity);
        this.hasSidecar = hasSidecar;
        this.mpg = mpg;
    }

    public Motorcycle(String brand, String model, int year, double fuelCapacity) {
        super(brand, model, year, fuelCapacity);
    }

    // Example getters (optional, but useful)
    public boolean hasSidecar() {
        return hasSidecar;
    }

    public double getMpg() {
        return mpg;
    }
}
