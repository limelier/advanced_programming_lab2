package com.company;

import java.util.*;

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
     *
     * @param trip The trip to be added.
     */
    public void addTrip(Client trip) {
        int index = 0;
        while (index < trips.size() && trips.get(index).getTime() < trip.getTime()) {
            index++;
        }
        trips.add(index, trip);
    }

    static final private Comparator<Client> compareByTime = Comparator.comparingInt(Client::getTime);

    /**
     * Checks if the slot a client requests is taken in a tour.
     *
     * @param trip The client/trip to check for.
     * @return Whether the tour can accommodate the client.
     */
    public boolean isTimeSlotTaken(Client trip) {
        return Collections.binarySearch(trips, trip, compareByTime) >= 0;
    }

    /**
     * Get a list of the names of the clients in the tour as a string, with an arrow after each one.
     *
     * @return The list.
     */
    public String getTripsList() {
        StringBuilder string = new StringBuilder();
        for (Client trip : trips) {
            string.append(trip.getName()).append(" -> ");
        }
        return string.toString();
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
