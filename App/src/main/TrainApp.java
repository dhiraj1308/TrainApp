import java.util.List;
import java.util.Optional;

class Bogie {
    private String type;
    private int seatCapacity;

    public Bogie(String type, int seatCapacity) {
        this.type = type;
        this.seatCapacity = seatCapacity;
    }

    public String getType() { return type; }
    public int getSeatCapacity() { return seatCapacity; }
}

public class TrainApp {
    public static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                // Filter only passenger-related bogies
                .filter(b -> b.getType().equalsIgnoreCase("Sleeper") ||
                        b.getType().equalsIgnoreCase("AC Chair") ||
                        b.getType().equalsIgnoreCase("First Class"))
                .map(Bogie::getSeatCapacity)
                // Use reduce to sum capacities; starting with an identity of 0
                .reduce(0, (total, current) -> total + current);
    }

    public static void main(String[] args) {
        List<Bogie> trainConsist = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("Rectangular", 0), // Goods bogie
                new Bogie("First Class", 24)
        );

        int totalSeats = calculateTotalSeats(trainConsist);
        System.out.println("Total Passenger Seats in Train: " + totalSeats);
    }
}