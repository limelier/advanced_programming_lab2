package com.company;

/**
 * @author Iacobescu Tudor
 */

public class Vehicle {
    private String name;
    private VehicleType type;

    private Tour tour;

    public Vehicle(String name, Depot depot, VehicleType type) {
        this.name = name;
        this.type = type;
        this.tour = new Tour();

        depot.addVehicle(this);
    }

    // // for demonstration purposes
    public Vehicle() {
        this.name = "";
        this.type = null;
        this.tour = new Tour();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public VehicleType getType() {
        return type;
    }

    // //

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", tour=" + tour +
                '}';
    }
}
