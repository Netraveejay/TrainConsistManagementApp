import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();
        System.out.println("Passenger bogie consist initialized.");
        System.out.println("Initial bogie count: " + passengerBogies.size());

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + hasSleeper);

        System.out.println("Final passenger bogie list: " + passengerBogies);
    }
}
