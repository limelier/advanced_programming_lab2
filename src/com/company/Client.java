package com.company;

/**
 * @author Iacobescu Tudor
 */

public class Client {
    private String name;
    private int time;

    /**
     * Create a client with the given name and desired trip time.
     * @param name Client's name.
     * @param time The time the client wishes to take their trip.
     */
    public Client(String name, int time) {
        this.name = name;
        this.time = time;
    }

    /**
     * Getter for the time the client wishes to take their trip.
      * @return The time.
     */
    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
