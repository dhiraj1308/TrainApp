package com.railway;

import com.railway.model.Bogie;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for UC9: Group Bogies by Type.
 */
public class TrainConsistAppTest {

    @Test
    void testGroupBogiesByCategory_Success() {
        // Arrange: Create a mixed list of Passenger and Goods bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("P1", "Sleeper", "Passenger"),
                new Bogie("G1", "Flatcar", "Goods"),
                new Bogie("P2", "Dining", "Passenger")
        );

        // Act: Apply grouping logic
        Map<String, List<Bogie>> result = TrainConsistApp.groupBogiesByCategory(bogies);

        // Assert: Verify map structure and counts
        assertEquals(2, result.size(), "Map should contain exactly 2 categories.");
        assertEquals(2, result.get("Passenger").size(), "Passenger group should have 2 entries.");
        assertEquals(1, result.get("Goods").size(), "Goods group should have 1 entry.");
        assertEquals("P1", result.get("Passenger").get(0).getId());
    }

    @Test
    void testGroupBogiesByCategory_EmptyList() {
        // Arrange: Empty input
        List<Bogie> emptyList = Arrays.asList();

        // Act: Apply grouping logic
        Map<String, List<Bogie>> result = TrainConsistApp.groupBogiesByCategory(emptyList);

        // Assert: Result should be an empty map, not null
        assertNotNull(result);
        assertTrue(result.isEmpty(), "Resulting map should be empty for an empty input list.");
    }
}