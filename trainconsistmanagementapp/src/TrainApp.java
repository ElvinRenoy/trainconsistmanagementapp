package trainconsistmanagementapp;

import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // UC1: Initialize Train and display initial consist summary
        ArrayList<String> trainConsist = new ArrayList<>();
        System.out.println("Initial train consist bogie count: " + trainConsist.size());

        System.out.println("\n--- UC2: Adding Passenger Bogies ---");

        // UC2: Create passenger bogies list
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing AC Chair: " + passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train consist.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Display final state of bogies
        System.out.println("Final passenger bogie list: " + passengerBogies);
    }
}