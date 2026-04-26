import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();
        System.out.println("Passenger bogie list initialized.");

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Second Sitting", 70));

        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(bogie -> bogie.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered passenger bogies (capacity > 60):");
        for (Bogie bogie : highCapacityBogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }

        System.out.println("Original passenger bogie count: " + passengerBogies.size());
        System.out.println("Filtered passenger bogie count: " + highCapacityBogies.size());
    }
}
