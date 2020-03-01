package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Problem {
    public List<Depot> depots;
    public List<Client> clients;

    /**
     * Create a new problem, with no depots or clients.
     */
    public Problem() {
        depots = new ArrayList<>();
        clients = new ArrayList<>();
    }

    /**
     * Add a depot to the problem, if it does not already exist.
     *
     * @param depot The depot to be added.
     */
    public void addDepot(Depot depot) throws IllegalArgumentException {
        if (!depots.contains(depot)) {
            depots.add(depot);
        } else {
            throw new IllegalArgumentException("Attempted to add already-existing depot to problem.");
        }
    }

    /**
     * Add a client to the problem, if it does not already exist.
     *
     * @param client The client to be added.
     */
    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        } else {
            throw new IllegalArgumentException("Attempted to add already-existing client to problem.");
        }
    }

    /**
     * Returns an array of all the vehicles in all of the problem's depots.
     *
     * @return The vehicle array.
     */
    public Vehicle[] getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        for (Depot depot : depots) {
            vehicles.addAll(depot.getVehicles());
        }
        Vehicle[] array = new Vehicle[vehicles.size()];
        vehicles.toArray(array);
        return array;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "depots=" + depots +
                ", clients=" + clients +
                '}';
    }
}
