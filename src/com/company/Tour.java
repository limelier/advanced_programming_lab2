package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
     * Add a new trip (client) to the tour, keeping the list of trips ordered by time ascending.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return trips.equals(tour.trips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trips);
    }
}
