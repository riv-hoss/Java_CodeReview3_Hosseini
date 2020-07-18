package citybike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class User {
    private static int counter = 1;
    protected final int userID;
    private String fname;
    private String lname;
    private ArrayList<Bike> currentlyRentedBike; // rethink later, maybe boolean or 1/0
    protected Rent rent;

    public User(String fname, String lname) {
        this.userID = counter++;
        this.fname = fname;
        this.lname = lname;
        this.currentlyRentedBike = new ArrayList<Bike>(); // empty ArrayList for rented bike
        this.rent = new Rent();
    }

    public ArrayList<Bike> getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void setCurrentlyRentedBike(ArrayList<Bike> currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }

    // rent bike method
    public void rentBike(Station station) { // no group rent! just one at a time.
        if (currentlyRentedBike.isEmpty()) {
            Bike rentbike = station.removeBike();
            // current date is automatically created when this method called
            this.rent.startDate = new Date();
            this.rent.bikeID = rentbike.getBikeID();

            currentlyRentedBike.add(rentbike);
        } else { // if user has already rented a bike
            System.out.println("You are currently riding bike #" +
                    currentlyRentedBike.get(0).getBikeID());
        }

    }

    // return rented bike method
    public void returnBike (Station station) {
        // current date is automatically created when this method called
        this.rent.endDate = new Date();
        station.addBike(currentlyRentedBike.remove(0));
       // return this.currentlyRentedBike.remove(0);
    }

    @Override
    public String toString() {
        if (currentlyRentedBike.isEmpty()) {
            return String.format("%s %s, user #%d, has no active bike!",
                    fname, lname, userID);
        }
        return String.format("%s %s, user #%d, is currently using bike #%d.",
                fname, lname, userID, currentlyRentedBike.get(0).getBikeID());


    }
}
