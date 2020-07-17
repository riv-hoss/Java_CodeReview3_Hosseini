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

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    // add bike to this station
    public void addBike (Bike bike) {
        if (this.bikes.size() > 5) { // adding limitation on number of parked bikes
            System.err.printf("%nNo free space to park bike " +
                    "with ID '%d' in station %d!", bike.getBikeID(), this.stationID);
            return;
        } else {
            this.bikes.add(bike);
        }
    }


    // remove(rent out) bike from station and return it (HashMap might be better!)
    // can also have NO Bike argument. First bike can be removed from ArrayList
    public Bike removeBike (Bike bike) {
        int ind = this.bikes.indexOf(bike);
        return this.bikes.remove(ind);
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
