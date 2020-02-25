package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Iacobescu Tudor
 */
public class Depot {
    private String name;
    private List<Vehicle> vehicles;

    /**
     * Creates a depot with the specified name, and no vehicles.
     * @param name The depot's name.
     */
    public Depot(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    /**
     * Add a vehicle to the depot.
     * @param vehicle The vehicle to add to the depot.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    
    @Override
    public String toString() {
        return "Depot{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
