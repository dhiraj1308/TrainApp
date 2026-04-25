import static org.junit.Assert.*;
import org.junit.Test;

public class TrainApp_Test {

    private final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue("TRN-1234 should be valid",
                TrainConsistManagementApp.validateInput("TRN-1234", TRAIN_ID_REGEX));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse("TRAIN12 should be invalid",
                TrainConsistManagementApp.validateInput("TRAIN12", TRAIN_ID_REGEX));
        assertFalse("TRN12A should be invalid",
                TrainConsistManagementApp.validateInput("TRN12A", TRAIN_ID_REGEX));
        assertFalse("1234-TRN should be invalid",
                TrainConsistManagementApp.validateInput("1234-TRN", TRAIN_ID_REGEX));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue("PET-AB should be valid",
                TrainConsistManagementApp.validateInput("PET-AB", CARGO_CODE_REGEX));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse("PET-ab (lowercase) should be invalid",
                TrainConsistManagementApp.validateInput("PET-ab", CARGO_CODE_REGEX));
        assertFalse("PET123 should be invalid",
                TrainConsistManagementApp.validateInput("PET123", CARGO_CODE_REGEX));
        assertFalse("AB-PET should be invalid",
                TrainConsistManagementApp.validateInput("AB-PET", CARGO_CODE_REGEX));
    }

    @Test
    public void testRegex_TrainIDDigitLengthValidation() {
        assertFalse("TRN-123 (too short) should be rejected",
                TrainConsistManagementApp.validateInput("TRN-123", TRAIN_ID_REGEX));
        assertFalse("TRN-12345 (too long) should be rejected",
                TrainConsistManagementApp.validateInput("TRN-12345", TRAIN_ID_REGEX));
    }

    @Test
    public void testRegex_CargoCodeUppercaseValidation() {
        // Only uppercase letters are accepted [cite: 1]
        assertFalse("Codes with lowercase should be rejected",
                TrainConsistManagementApp.validateInput("PET-Ab", CARGO_CODE_REGEX));
    }

    @Test
    public void testRegex_EmptyInputHandling() {
        assertFalse("Empty Train ID should be invalid",
                TrainConsistManagementApp.validateInput("", TRAIN_ID_REGEX));
        assertFalse("Empty Cargo Code should be invalid",
                TrainConsistManagementApp.validateInput("", CARGO_CODE_REGEX));
    }

    @Test
    public void testRegex_ExactPatternMatch() {
        // Ensures matches() checks the full string, not partial [cite: 1]
        assertFalse("TRN-1234extra should be rejected",
                TrainConsistManagementApp.validateInput("TRN-1234extra", TRAIN_ID_REGEX));
    }
}