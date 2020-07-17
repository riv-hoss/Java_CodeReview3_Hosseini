package citybike;

public class Bike {
    private static int counter = 1;
    private int bikeID;
    private String color;
    private String  state;

    public Bike(String color, String  state) {
        this.color = color;
        this.state = state;
        this.bikeID = counter++;
    }

    public int getBikeID() {
        return bikeID;
    }

    public String getColor() {
        return color;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeID=" + bikeID +
                ", color='" + color + '\'' +
                ", state=" + state +
                "}\n\t\t";
    }
}
