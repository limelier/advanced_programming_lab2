package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */

public class Tour {
    private List<Client> trips;

    public Tour() {
        trips = new ArrayList<>();
    }

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
