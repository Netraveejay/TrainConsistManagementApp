import java.util.LinkedHashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        System.out.println("Train formation initialized with LinkedHashSet.");
        System.out.println("Initial bogie count: " + trainFormation.size());

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("Final formation order: " + trainFormation);
    }
}
