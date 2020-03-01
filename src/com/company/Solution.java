package com.company;

import java.util.List;

/**
 * @author limelier
 */
public class Solution {
    List<Depot> depots;

    /**
     * Creates a solution with a list of all depots.
     * The solution contains a list of all depots in the problem, each with their appropriate vehicles, containing the
     * trips that will solve the problem.
     *
     * @param problem The problem instance, modified destructively.
     */
    public Solution(Problem problem) {
        this.depots = problem.depots;

        Vehicle[] vehicles = problem.getAllVehicles();
        List<Client> clients = problem.clients;

        while (!clients.isEmpty()) {
            Client client = clients.get(0);
            boolean clientAccommodated = false;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.canAccommodateClient(client)) {
                    vehicle.addClient(client);
                    clientAccommodated = true;
                    break;
                }
            }
            if (!clientAccommodated) {
                throw new Error("Problem is impossible!");
            }

            clients.remove(client);
        }
    }

    /**
     * Get the solution as a string in the format specified in the course.
     *
     * @return The solution.
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Depot depot : depots) {
            for (Vehicle vehicle : depot.getVehicles()) {
                String vehicleRoute = vehicle.getName() +
                        ": " +
                        depot.getName() +
                        " -> " +
                        vehicle.getTour() +
                        depot.getName() +
                        ", ";
                string.append(vehicleRoute);
            }
        }
        return string.toString();
    }
}
