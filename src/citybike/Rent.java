package citybike;

import java.util.Date;
public class Rent {
    protected int bikeID;
    protected Date startDate;
    protected Date endDate;


    @Override
    public String toString() {
        return "Rent{" +
                "bikeID=" + bikeID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
