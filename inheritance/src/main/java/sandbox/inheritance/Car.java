package org.example.sandbox.inheritance;

public class Car extends Vehicle {

    private int doors;
    private double mpg;

    public Car(String brand, String model, int year, double fuelCapacity, int doors, double mpg) {
        super(brand, model, year, fuelCapacity);
        this.doors = doors;
        this.mpg = mpg;
    }

    @Override
    public double calculateRange() {
        return fuelCapacity * mpg;
    }

    @Override
    public void start() {
        System.out.println("Starting Car");

    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }

    @Override
    public double getMaxSpeed() {
        return 120.0; // max speed of 120 mph
    }

    // Overriding refuel method
    @Override
    public void refuel(){
        System.out.println("Refueling Car");
    }

    // Additional method specific to Car
    public void openTrunk() {
        System.out.println("Opening Trunk");
    }

    public int getDoors() {
        return doors;
    }
}
