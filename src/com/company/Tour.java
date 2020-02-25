package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Tour {
    private List<Client> trips;

    /**
     * Create a new tour, with no trips in it.
     */
    public Tour() {
        trips = new ArrayList<>();
    }

    /**
     * Add a new trip (client) to the tour.
     * @param trip The trip to be added.
     */
    public void addTrip(Client trip) {
        int index = 0;
        while (index < trips.size() && trips.get(index).getTime() < trip.getTime()) {
            index++;
        }
        trips.add(index, trip);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "trips=" + trips +
                '}';
    }
}
