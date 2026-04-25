import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class TrainApp_Test {

    @Test
    public void testCalculateTotalSeats_MixedBogies() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("Cylindrical", 0) // Should be ignored
        );

        int result = Train.calculateTotalSeats(bogies);
        assertEquals(128, result, "Total seats should sum Sleeper and AC Chair only.");
    }

    @Test
    public void testCalculateTotalSeats_EmptyList() {
        List<Bogie> bogies = new ArrayList<>();
        int result = Train.calculateTotalSeats(bogies);
        assertEquals(0, result, "Total seats for an empty consist should be 0.");
    }

    @Test
    public void testCalculateTotalSeats_OnlyGoodsBogies() {
        List<Bogie> bogies = List.of(
                new Bogie("Rectangular", 0),
                new Bogie("Cylindrical", 0)
        );
        int result = Train.calculateTotalSeats(bogies);
        assertEquals(0, result, "Total seats should be 0 if no passenger bogies exist.");
    }
}