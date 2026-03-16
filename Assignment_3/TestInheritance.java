package Assignment_3;

import java.util.Scanner;

class Continent {
    String continent;

    void getContinent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent {
    String country;

    void getCountry(String country) {
        this.country = country;
    }
}

class State extends Country {
    String state, place;

    void getState(String state, String place) {
        this.state = state;
        this.place = place;
    }

    void display() {
        System.out.println("Place: " + place);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        State s = new State();

        System.out.print("Enter Continent: ");
        String cont = sc.nextLine();

        System.out.print("Enter Country: ");
        String coun = sc.nextLine();

        System.out.print("Enter State: ");
        String st = sc.nextLine();

        System.out.print("Enter Place: ");
        String pl = sc.nextLine();

        s.getContinent(cont);
        s.getCountry(coun);
        s.getState(st, pl);

        System.out.println("\nDetails:");
        s.display();
    }
}