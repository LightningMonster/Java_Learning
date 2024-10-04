/*
 * Write a program for multilevel inheritance such that Country is inherited from Continent. 
 State is inherited from Country. Display the place, State, Country and Continent.
 */

package Sem_5_slips;

// Base class: Continent
class Continent {
    String continentName;

    // Constructor for Continent
    Continent(String continentName) {
        this.continentName = continentName;
    }

    // Method to display continent name
    void displayContinent() {
        System.out.println("Continent: " + continentName);
    }
}

// Derived class: Country, inherited from Continent
class Country extends Continent {
    String countryName;

    // Constructor for Country
    Country(String continentName, String countryName) {
        super(continentName); // Call to the superclass (Continent) constructor
        this.countryName = countryName;
    }

    // Method to display country name
    void displayCountry() {
        System.out.println("Country: " + countryName);
    }
}

// Derived class: State, inherited from Country
class State extends Country {
    String stateName;

    // Constructor for State
    State(String continentName, String countryName, String stateName) {
        super(continentName, countryName); // Call to the superclass (Country) constructor
        this.stateName = stateName;
    }

    // Method to display state name
    void displayState() {
        System.out.println("State: " + stateName);
    }

    // Method to display all details
    void displayPlaceDetails() {
        displayState();
        displayCountry();
        displayContinent();
    }
}

// Main class to run the program
public class slip_5_1 {
    public static void main(String[] args) {
        // Create an object of State and pass continent, country, and state names
        State place = new State("Asia", "India", "Maharashtra");

        // Display the details of the place (State, Country, Continent)
        place.displayPlaceDetails();
    }
}

