package com.railway;

import com.railway.model.Bogie;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Main application for UC9.
 * Demonstrates grouping a list of Bogies by their category (e.g., Passenger vs Goods).
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        List<Bogie> trainConsist = getSampleBogies();

        // Execution of the grouping logic
        Map<String, List<Bogie>> groupedResults = groupBogiesByCategory(trainConsist);

        // Outputting results for verification
        System.out.println("--- Grouped Train Consist ---");
        groupedResults.forEach((category, list) -> {
            System.out.println(category + ": " + list.size() + " items");
            list.forEach(b -> System.out.println("  -> " + b.getId() + " [" + b.getType() + "]"));
        });
    }

    /**
     * Logic for UC9: Groups bogies into a Map using Java Streams.
     * @param bogies The raw list of bogies.
     * @return A Map where the key is the category and value is the list of bogies in that category.
     */
    public static Map<String, List<Bogie>> groupBogiesByCategory(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getCategory));
    }

    private static List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("B1", "Sleeper", "Passenger"),
                new Bogie("B2", "AC Chair", "Passenger"),
                new Bogie("G1", "Rectangular", "Goods"),
                new Bogie("B3", "First Class", "Passenger"),
                new Bogie("G2", "Cylindrical", "Goods")
        );
    }
}