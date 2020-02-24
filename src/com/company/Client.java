package com.company;

/**
 * @author Iacobescu Tudor
 */

public class Client {
    private String name;
    private int time;

    public Client(String name, int time) {
        this.name = name;
        this.time = time;
    }

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
