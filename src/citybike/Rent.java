package citybike;

import java.util.Date;
public class Rent {
    public int bikeID;
    public Date startDate;
    public Date endDate;


    @Override
    public String toString() {
        return "Rent{" +
                "bikeID=" + bikeID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
