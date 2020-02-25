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
     * Add a vehicle to the depot, if it does not already exist.
     * @param vehicle The vehicle to add to the depot.
     */
    public void addVehicle(Vehicle vehicle) throws IllegalArgumentException {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
        }
        else {
            throw new IllegalArgumentException("Attempted to add already-existing vehicle to depot.");
        }
    }


    @Override
    public String toString() {
        return "Depot{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depot depot = (Depot) o;
        return name.equals(depot.name) &&
                vehicles.equals(depot.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicles);
    }
}
