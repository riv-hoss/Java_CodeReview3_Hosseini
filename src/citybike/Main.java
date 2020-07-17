package citybike;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        // 8 Bike objects
        Bike bikeOne = new Bike("red", "CanNotBeRented");
        Bike bikeTwo = new Bike("black", "CanNotBeRented");
        Bike bikeThree = new Bike("blue", "CanBeRented");
        Bike bikeFour = new Bike("dark brown", "CanBeRented");
        Bike bikeFive = new Bike("silver", "CanBeRented");
        Bike bikeSix = new Bike("blue", "InService");
        Bike bikeSeven = new Bike("black", "InService");
        Bike bikeEight = new Bike("white", "Discarded");

        // HashMap containing 8 Bike objects
        HashMap<Integer, Bike> bikes = new HashMap<>()
        {{
            put(bikeOne.getBikeID(), bikeOne);
            put(bikeTwo.getBikeID(), bikeTwo);
            put(bikeThree.getBikeID(), bikeThree);
            put(bikeFour.getBikeID(), bikeFour);
            put(bikeFive.getBikeID(), bikeFive);
            put(bikeSix.getBikeID(), bikeSix);
            put(bikeSeven.getBikeID(), bikeSeven);
            put(bikeEight.getBikeID(), bikeEight);
        }};

        // printing each bike in the HashMap 'bikes'
        for (Integer i : bikes.keySet()) {
            System.out.println(bikes.get(i));
        }


        // creating 3 Station objects
        String locationOne = "Abstract-strasse 2, Vienna";
        String locationTwo = "Java-gasse 11, Vienna";
        String locationThree = "Bool-gasse 10, Vienna ";
        ArrayList<Bike> bikeArrayListOne = new ArrayList<>(Arrays.asList(bikeOne, bikeTwo));
        ArrayList<Bike> bikeArrayListTwo = new ArrayList<>(Arrays.asList(bikeEight, bikeFive, bikeFour));
        ArrayList<Bike> bikeArrayListThree = new ArrayList<>(Arrays.asList(bikeSeven, bikeSix, bikeThree));

        Station stationOne = new Station(locationOne, bikeArrayListOne);
        Station stationTwo = new Station(locationTwo, bikeArrayListTwo);
        Station stationThree = new Station(locationThree, bikeArrayListThree);

        HashMap<Integer, Station> stations = new HashMap<>()
        {{
            put(stationOne.getStationID(), stationOne);
            put(stationTwo.getStationID(), stationTwo);
            put(stationThree.getStationID(), stationThree);
        }};

        // create new bikes to add them to station objects using addBike() method
        Bike bike09 = new Bike("white", "CanNotBeRented");
        Bike bike10 = new Bike("gray", "CanBeRented");
        Bike bike11 = new Bike("light gray", "CanBeRented");
        Bike bike12 = new Bike("silver", "CanBeRented");
        Bike bike13 = new Bike("red", "InService");
        Bike bike14 = new Bike("green", "InService");
        Bike bike15 = new Bike("green", "Discarded");

        // add above bikes to station objects
        stationOne.addBike(new ArrayList<>
                (Arrays.asList(bike09, bike13, bike11))); // station 1
        stationTwo.addBike(new ArrayList<>
                (Arrays.asList(bike10, bike14, bike12, bike15))); // station 2



    }
}
