package citybike;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        // 8 Bike objects
        Bike bike01 = new Bike("red", "CanNotBeRented");
        Bike bike02 = new Bike("black", "CanNotBeRented");
        Bike bike03 = new Bike("blue", "CanBeRented");
        Bike bike04 = new Bike("dark brown", "CanBeRented");
        Bike bike05 = new Bike("silver", "CanBeRented");
        Bike bike06 = new Bike("blue", "InService");
        Bike bike07 = new Bike("black", "InService");
        Bike bike08 = new Bike("white", "Discarded");

        // HashMap containing 8 Bike objects
        HashMap<Integer, Bike> bikes = new HashMap<>()
        {{
            put(bike01.getBikeID(), bike01);
            put(bike02.getBikeID(), bike02);
            put(bike03.getBikeID(), bike03);
            put(bike04.getBikeID(), bike04);
            put(bike05.getBikeID(), bike05);
            put(bike06.getBikeID(), bike06);
            put(bike07.getBikeID(), bike07);
            put(bike08.getBikeID(), bike08);
        }};

        // printing each bike in the HashMap 'bikes'
        for (Integer i : bikes.keySet()) {
            System.out.println(bikes.get(i));
        }


        // creating 3 Station objects
        String locationOne = "Abstract-strasse 2, Vienna";
        String locationTwo = "Java-gasse 11, Vienna";
        String locationThree = "Bool-gasse 10, Vienna ";

        Station stationOne = new Station(locationOne);
        Station stationTwo = new Station(locationTwo);
        Station stationThree = new Station(locationThree);

        HashMap<Integer, Station> stations = new HashMap<>()
        {{
            put(stationOne.getStationID(), stationOne);
            put(stationTwo.getStationID(), stationTwo);
            put(stationThree.getStationID(), stationThree);
        }};

        // create new bikes to add them to station objects using addBike() method
        Bike bike09 = new Bike("white", "CanBeRented");
        Bike bike10 = new Bike("gray", "CanBeRented");
        Bike bike11 = new Bike("light gray", "CanBeRented");
        Bike bike12 = new Bike("silver", "CanBeRented");
        Bike bike13 = new Bike("red", "CanBeRented");
        Bike bike14 = new Bike("green", "InService");
        Bike bike15 = new Bike("green", "Discarded");

        // add above bikes to station objects
        stationOne.addBike(bike09);                 // station 1
        stationOne.addBike(bike11);
        stationOne.addBike(bike13);
        stationOne.addBike(bike12);
        stationOne.addBike(bike04);

        stationTwo.addBike(bike10);                 // station 2
        stationTwo.addBike(bike14);
        stationTwo.addBike(bike03);



        // stations and their bikes
        System.out.println("\n====================== station #1 " +
                "is full and cannot accept bike #15 ======================");
        stationOne.addBike(bike15);
        System.out.println(stationOne.getBikes());
        System.out.println("\n============================= station #2 ============================");
        System.out.println(stationTwo.getBikes());
        System.out.println("\n============================= station #3 ============================");
        System.out.println(stationThree.getBikes());



        // creating 3 users
        User userOne = new User("Clint",  "EastBush");
        User userTwo = new User("Michael",  "JackDaughter");
        User userThree = new User("John",  "Doe");
        User userFour = new User("Tom",  "Softy");


        //////////////////////////////////// renting process - user rents bike //////////////////////////////////
/*        System.out.println("\n=================================================== Renting process ! " +
                "=========================================================");

        // userOne rent a bike from stationOne
        System.out.println("\n============================= bikes of station #1" +
                " BEFORE renting ============================");
        System.out.println(stationOne.getBikes());

        System.out.println("\n============================= bike of user #1" +
                " BEFORE renting ============================");
        System.out.println(userOne.getCurrentlyRentedBike());


        System.out.println("\n============================= bikes of station #1" +
                " AFTER renting ============================");
        //Bike bikeInProcessOfRent = stationOne.removeBike(); // bike11 was added to stationOne before
        System.out.println(stationOne.getBikes());

        System.out.println("\n============================= bike of user #1" +
                " AFTER renting ============================");
        userOne.rentBike(bikeInProcessOfRent);
        System.out.println(userOne.getCurrentlyRentedBike());
        System.out.println("Printing userOne calling toString(): \n" + userOne);


        userOne return rented bike to the stationTwo
        System.out.println("\n============================= bikes of station #2" +
                " BEFORE user #1 returns the bike ============================");
        System.out.println(stationTwo.getBikes());

        Bike bikeInProcessOfReturn = userOne.returnBike(); // user returns the bike
        stationTwo.addBike(bikeInProcessOfReturn); // bike being added to the station 2

        System.out.println("\n============================= bikes of station #2" +
                " AFTER user #1 returns the bike ============================");
        System.out.println(stationTwo.getBikes());


        System.out.println("\n============================= bike of user #1" +
                " AFTER returning ============================");
        System.out.println(userOne.getCurrentlyRentedBike());
        System.out.println("Printing userOne calling toString(): \n" + userOne);*/


        System.out.println("userOne BEFORE rent: \n" + userOne);
        userOne.rentBike(stationOne);
        System.out.println("stationOne AFTER rent: \n" + stationOne);
        System.out.println("userOne AFTER rent: \n" + userOne);

        userOne.returnBike(stationTwo);
        System.out.println("userOne AFTER return rental to stationTwo: \n" + userOne);
        System.out.println("stationTwo AFTER rental return: \n" + stationTwo);

        System.out.println("\nRent log is: \n" + userOne.rent);

    }
}
