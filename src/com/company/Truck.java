package com.company;

public class Truck extends Vehicle {
    /**
     * Create a truck with a blank tour, adding it to a depot.
     *
     * @param name  The vehicle's name.
     * @param depot The depot the vehicle needs to be added to.
     */
    public Truck(String name, Depot depot) {
        super(name, depot);
    }

    /**
     * Create a truck with no name or parent depot, and a blank tour.
     */
    public Truck() {
        super();
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}

