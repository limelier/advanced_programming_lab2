package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Depot {
    private String name;
    private List<Vehicle> vehicles;

    public Depot(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

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
