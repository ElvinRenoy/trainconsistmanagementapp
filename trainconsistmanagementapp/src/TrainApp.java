import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    static List<String> bogies = new ArrayList<>();

    public static void main(String[] args) {

        // UC1
        initializeTrain();

        // UC2
        managePassengerBogies();
    }

    // UC1 Method
    public static void initializeTrain() {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println();
    }

    // UC2 Method
    public static void managePassengerBogies() {

        System.out.println("Adding passenger bogies...");

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display list
        System.out.println("Bogies after addition: " + bogies);

        // Remove one bogie
        System.out.println("Removing AC Chair bogie...");
        bogies.remove("AC Chair");

        // Check existence
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final list
        System.out.println("Final bogie list: " + bogies);
    }
}