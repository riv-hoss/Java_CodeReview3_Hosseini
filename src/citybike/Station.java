package citybike;

import java.util.ArrayList;

public class Station {
    private static int counter = 1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikes;

    public Station(String location, ArrayList<Bike> bikes) {
        this.stationID = counter++;
        this.location = location;
        this.bikes = bikes;
    }
}
