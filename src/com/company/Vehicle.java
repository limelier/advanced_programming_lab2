package com.company;

/**
 * @author Iacobescu Tudor
 */

public class Vehicle {
    private String name;
    private VehicleType type;

    public Tour tour;

    /**
     * Create a vehicle with a blank tour, adding it to a depot.
     * @param name The vehicle's name.
     * @param depot The depot the vehicle needs to be added to.
     * @param type The vehicle's type.
     */
    public Vehicle(String name, Depot depot, VehicleType type) {
        this.name = name;
        this.type = type;
        this.tour = new Tour();

        depot.addVehicle(this);
    }

    //// for demonstration purposes

    /**
     * Create a vehicle with no name, type or parent depot, and a blank tour.
     */
    public Vehicle() {
        this.name = "";
        this.type = null;
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
     * Setter for vehicle type.
     * @param type Type to give the vehicle.
     */
    public void setType(VehicleType type) {
        this.type = type;
    }

    /**
     * Getter for vehicle name.
     * @return Vehicle name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for vehicle type.
     * @return Vehicle type.
     */
    public VehicleType getType() {
        return type;
    }

    ////

    /**
     * Describe the vehicle object as a string.
     * @return The resulting string.
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", tour=" + tour +
                '}';
    }
}
