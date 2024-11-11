
/*
Author: Ahmed Essam Taj
Date: 11, November
Project (2) - Car Pooling System

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creating 2 route objects
        Route route1 = new Route("Al-Arid", "Tuwaiq Academy", 50.99);
        Route route2 = new Route("Tuwaiq Academy", "Al-Narjs", 30);

        // checking route objects info
        System.out.println("Route 1 start address: " + route1.getStartAddress());
        System.out.println("Route 1 destination address: " + route1.getDestinationAddress());
        System.out.println("Rout 1 trip price: $" + route1.getTripPrice());
        System.out.println("-------------------------------------------");
        System.out.println("Route 2 start address: " + route2.getStartAddress());
        System.out.println("Route 2 destination address: " + route2.getDestinationAddress());
        System.out.println("Rout 2 trip price: $" + route2.getTripPrice() );

        // Creating 2 car objects one with 0 capacity
        System.out.println("-------------------------------------------");
        Car car = new Car("abc123", 2, route1);
        Car car2 = new Car("aza222", 0, route2);

        // Checking car info
        System.out.println("Car 1 Code: " + car.getCode());
        System.out.println("Car 1 Max Capacity: " + car.getMaxCapacityPerTrip());
        System.out.println("Car 1 route (start address): " + car.getRoute().getStartAddress());
        System.out.println("Car 1 route (destination address): " + car.getRoute().getDestinationAddress());
        System.out.println("-------------------------------------------");
        System.out.println("Car 2 Code: " + car2.getCode());
        System.out.println("Car 2 Max Capacity: " + car2.getMaxCapacityPerTrip());
        System.out.println("Car 2 route (start address): " + car2.getRoute().getStartAddress());
        System.out.println("Car 2 route (destination address): " + car2.getRoute().getDestinationAddress());


        // array list of Passenger objects
        System.out.println("-------------------------------------------");
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Non_subscribers("Ahmed Taj", "1234", true));
        passengers.add(new Subscribers("Majed Alghamdi", "1se221"));

        // Check passenger info .. NOTE: No Car and Cost are put in the constructor
        // since it will be assigned and calculated
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Passenger ID: " + passenger.getId());
            System.out.println("-------------------------------------------");
        }


        // Function to reserve the car and calculate price..
        passengers.get(0).makeReservation(car);
        passengers.get(1).makeReservation(car2);

        // print the info of all passengers.... with the trip coast.
        printPassengerTrips(passengers);

        // reverse the car reservation..
        passengers.get(1).makeReservation(car);
        passengers.get(0).makeReservation(car2);

        // Check the new reservations..
        printPassengerTrips(passengers);

    }

    public static void printPassengerTrips (ArrayList<Passenger> passengers) {
        for (Passenger passenger : passengers) {
            System.out.println("-------------------------------------------");
            passenger.printInfo();
        }
    }
}