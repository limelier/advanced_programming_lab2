package com.company;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 * @author Iacobescu Tudor
 */


public class Main {

    public static void main(String[] args) {
        Client c1 = new Client("C1", 1);
        Client c2 = new Client("C2", 1);
        Client c3 = new Client("C3", 2);
        Client c4 = new Client("C4", 2);
        Client c5 = new Client("C5", 3);

        Depot d1 = new Depot("D1");
        Depot d2 = new Depot("D2");

        Vehicle v1 = new Car("V1", d1);
        Vehicle v2 = new Truck("V2", d1);

        try {
            Vehicle v4 = new Truck("V2", d1);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // getter-setter demonstrations
        Vehicle v3 = new Drone();
        v3.setName("V3");
        d2.addVehicle(v3);

        // tour self-sorting insert test
        v3.tour.addTrip(c5);
        v3.tour.addTrip(c3);

        Problem problem = new Problem();
        problem.addDepot(d1);
        problem.addDepot(d2);
        try {
            Depot d3 = new Depot("D2");
            problem.addDepot(d3);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        problem.addClient(c1);
        problem.addClient(c2);
        problem.addClient(c3);
        problem.addClient(c4);
        problem.addClient(c5);
        try {
            Client c6 = new Client("C5", 3);
            problem.addClient(c6);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(problem);

        Vehicle[] vehicles = problem.getAllVehicles();
        System.out.println(Arrays.toString(vehicles));
    }
}
