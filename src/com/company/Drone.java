package com.company;

public class Drone extends Vehicle {
    /**
     * Create a drone with a blank tour, adding it to a depot.
     *
     * @param name  The vehicle's name.
     * @param depot The depot the vehicle needs to be added to.
     */
    public Drone(String name, Depot depot) {
        super(name, depot);
    }

    /**
     * Create a drone with no name or parent depot, and a blank tour.
     */
    public Drone() {
        super();
    }

    @Override
    public String toString() {
        return "Drone" + super.toString();
    }
}
