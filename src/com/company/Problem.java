package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Problem {
    List<Depot> depots;
    List<Client> clients;

    /**
     * Create a new problem, with no depots or clients.
     */
    public Problem() {
        depots = new ArrayList<>();
        clients = new ArrayList<>();
    }

    /**
     * Add a depot to the problem.
     * @param depot The depot to be added.
     */
    public void addDepot(Depot depot) {
        depots.add(depot);
    }

    /**
     * Add a client to the problem.
     * @param client The client to be added.
     */
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public String toString() {
        return "Problem{" +
                "depots=" + depots +
                ", clients=" + clients +
                '}';
    }
}
