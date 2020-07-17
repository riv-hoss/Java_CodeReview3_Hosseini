package citybike;

import java.util.ArrayList;

public class Station {
    private static int counter = 1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikes; // arrayList selected for now

    public Station(String location, ArrayList<Bike> bikes) {
        this.stationID = counter++;
        this.location = location;
        this.bikes = bikes;
    }

    public int getStationID() {
        return stationID;
    }


    // add bike to this station
    public void addBike (Bike bike) {
        this.bikes.add(bike);
    }
    // overloading addBike method to also accept ArrayList
    public void addBike (ArrayList<Bike> bikes) {
        this.bikes.addAll(bikes);
    }
}
