package test;

import main.UseCase14TrainConsistMgmt;
import main.UseCase14TrainConsistMgmt.PassengerBogie;
import main.UseCase14TrainConsistMgmt.InvalidCapacityException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            PassengerBogie bogie = new PassengerBogie("Sleeper", 72);
            assertNotNull(bogie);
        });
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC", -10);
        });
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("FirstClass", 0);
        });

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 80);

        assertEquals("Sleeper", bogie.getType());
        assertEquals(80, bogie.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC", 60);
            PassengerBogie b3 = new PassengerBogie("FirstClass", 40);

            assertNotNull(b1);
            assertNotNull(b2);
            assertNotNull(b3);
        });
    }
}