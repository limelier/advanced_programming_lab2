package com.company;

public class Car extends Vehicle {
    /**
     * Create a car with a blank tour, adding it to a depot.
     *
     * @param name  The vehicle's name.
     * @param depot The depot the vehicle needs to be added to.
     */
    public Car(String name, Depot depot) {
        super(name, depot);
    }

    /**
     * Create a car with no name or parent depot, and a blank tour.
     */
    public Car() {
        super();
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
