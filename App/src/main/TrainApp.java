import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {

    // Regex patterns as defined in requirements
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC11: Train ID & Cargo Code Validation ---");

        // 1. Validate Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();
        if (validateInput(trainId, TRAIN_ID_REGEX)) {
            System.out.println("✔ Valid Train ID: " + trainId);
        } else {
            System.out.println("❌ Invalid Train ID format. Expected TRN-XXXX (4 digits).");
        }

        // 2. Validate Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();
        if (validateInput(cargoCode, CARGO_CODE_REGEX)) {
            System.out.println("✔ Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("❌ Invalid Cargo Code format. Expected PET-XX (2 uppercase letters).");
        }

        scanner.close();
    }

    /**
     * Utility method to validate input against a regex pattern.
     */
    public static boolean validateInput(String input, String regex) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches(); // Checks the entire string [cite: 1]
    }
}