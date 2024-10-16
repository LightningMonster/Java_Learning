/*
 * Write a program for multilevel inheritance such that Country is inherited from Continent. 
 State is inherited from Country. Display the place, State, Country and Continent.
 */


// Base class
class Continent {
    private String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}

// Derived class
class Country extends Continent {
    private String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}

// Another derived class
class State extends Country {
    private String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
}

// Class to represent a place
class Place extends State {
    private String placeName;

    public Place(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    public void displayDetails() {
        System.out.println("Place: " + placeName);
        System.out.println("State: " + getStateName());
        System.out.println("Country: " + getCountryName());
        System.out.println("Continent: " + getContinentName());
    }
}

// Main class to test the implementation
public class slip_5_1 {
    public static void main(String[] args) {
        // Creating an object of Place
        Place place = new Place("Asia", "India", "Maharashtra", "Mumbai");

        // Displaying the details
        place.displayDetails();
    }
}

