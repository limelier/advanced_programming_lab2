package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Problem {
    List<Depot> depots;
    List<Client> clients;

    public Problem() {
        depots = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addDepot(Depot depot) {
        depots.add(depot);
    }

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
