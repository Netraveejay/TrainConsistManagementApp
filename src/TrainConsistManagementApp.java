import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();
        System.out.println("Tracking unique bogie IDs.");
        System.out.println("Initial unique bogie count: " + bogieIds.size());

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");
        bogieIds.add("BG102");

        System.out.println("Unique bogie IDs in consist: " + bogieIds);
        System.out.println("Final unique bogie count: " + bogieIds.size());
    }
}
