package citybike;

import java.util.ArrayList;
import java.util.Scanner;

public class Station {
    private static int counter = 1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikes; // arrayList selected for now

    public Station(String location) {
        this.stationID = counter++;
        this.location = location;
        this.bikes = new ArrayList<>();
    }

    public int getStationID() {
        return stationID;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    // add bike to this station
    public void addBike (Bike bike) {
        if (this.bikes.size() <= 4) { // add limitation on number of parked bikes to 5
            this.bikes.add(bike);
        } else {
            System.err.printf("%nNo free space to park bike " +
                    "with ID '%d' in station %d!%n", bike.getBikeID(), this.stationID);
        }
    }

    // categorize bikes per status
    private static ArrayList<Bike> availableBikes = new ArrayList<>();
    private static ArrayList<Integer> availableBikeIDs = new ArrayList<>();
    private static ArrayList<Bike> notAvailableBikes = new ArrayList<>();
    private static ArrayList<Bike> outOfServiceBikes = new ArrayList<>();
    private static ArrayList<Bike> discardedBikes = new ArrayList<>();
    public void categorizeBikes () {
        for ( Bike b : bikes) {
            if (b.getState().equalsIgnoreCase("CanBeRented")) {
                availableBikes.add(b);
                availableBikeIDs.add(b.getBikeID());
            } else if (b.getState().equalsIgnoreCase("CanNotBeRented")) {
                notAvailableBikes.add(b);
            } else if (b.getState().equalsIgnoreCase("InService")) {
                outOfServiceBikes.add(b);
            } else {
                discardedBikes.add(b);
            }
        }
    }

    // remove(rent out) bike from station and return it (HashMap might be better!)
    public Bike removeBike () {
        categorizeBikes(); // categorize all bikes based on their status
        Scanner in = new Scanner(System.in);
        System.out.println("Bikes with following numbers are available: " + availableBikeIDs);
        System.out.print("Enter the bike number you want to rent:  ");
        System.out.println();
        int selectedID = in.nextInt();
        int ind = 0;
        for (Bike b : availableBikes) {
            if (b.getBikeID() == selectedID) {
                ind = this.bikes.indexOf(b); // get the index of selected bike
                //availableBikes.remove(b); // remove selected bike from available bikes
            }
        }

        return this.bikes.remove(ind); // remove and return selected bike
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationID=" + stationID +
                ", location='" + location + '\'' +
                "\n\t\t, bikes=" + bikes +
                "}\n";
    }
}
