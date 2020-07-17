package citybike;

public class User {
    private static int counter = 1;
    private int userID;
    private String fname;
    private String lname;
    private Bike currentlyRentedBike; // rethink later, maybe boolean or 1/0

    public User(String fname, String lname) {
        this.userID = counter++;
        this.fname = fname;
        this.lname = lname;
    }

    public Bike getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void rentBike(Bike bike) { // no group rent! just one at a time.
        this.currentlyRentedBike = bike;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + fname + " " +lname + '\'' +
                ", currentlyRentedBike=" + currentlyRentedBike +
                '}';
    }
}
