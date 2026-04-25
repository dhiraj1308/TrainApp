package test;

import main.UseCase20TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        UseCase20TrainConsistMgmt obj = new UseCase20TrainConsistMgmt();

        String[] data = {};

        assertThrows(IllegalStateException.class, () -> {
            obj.searchBogie(data, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        UseCase20TrainConsistMgmt obj = new UseCase20TrainConsistMgmt();

        String[] data = {"BG101","BG205"};

        assertDoesNotThrow(() -> {
            obj.searchBogie(data, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        UseCase20TrainConsistMgmt obj = new UseCase20TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309"};

        assertTrue(obj.searchBogie(data, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        UseCase20TrainConsistMgmt obj = new UseCase20TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309"};

        assertFalse(obj.searchBogie(data, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        UseCase20TrainConsistMgmt obj = new UseCase20TrainConsistMgmt();

        String[] data = {"BG101"};

        assertTrue(obj.searchBogie(data, "BG101"));
    }
}