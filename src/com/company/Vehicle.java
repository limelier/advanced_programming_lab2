package com.company;

import java.util.Objects;

/**
 * @author Iacobescu Tudor
 */

public abstract class Vehicle {
    private String name;

    public Tour tour;

    /**
     * Create a vehicle with a blank tour, adding it to a depot.
     * @param name The vehicle's name.
     * @param depot The depot the vehicle needs to be added to.
     */
    public Vehicle(String name, Depot depot) {
        this.name = name;
        this.tour = new Tour();

        depot.addVehicle(this);
    }

    //// for demonstration purposes

    /**
     * Create a vehicle with no name or parent depot, and a blank tour.
     */
    public Vehicle() {
        this.name = "";
        this.tour = new Tour();
    }

    /**
     * Setter for vehicle name.
     * @param name Name to give the vehicle.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for vehicle name.
     * @return Vehicle name.
     */
    public String getName() {
        return name;
    }

    ////


    @Override
    public String toString() {
        return  "{" +
                "name='" + name + '\'' +
                ", tour=" + tour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return name.equals(vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
