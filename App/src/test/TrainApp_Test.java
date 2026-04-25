package test;

import main.UseCase18TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmtTest {

    @Test
    void testSearch_BogieFound() {
        UseCase18TrainConsistMgmt obj = new UseCase18TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.searchBogie(data, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        UseCase18TrainConsistMgmt obj = new UseCase18TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(obj.searchBogie(data, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        UseCase18TrainConsistMgmt obj = new UseCase18TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.searchBogie(data, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        UseCase18TrainConsistMgmt obj = new UseCase18TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.searchBogie(data, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {
        UseCase18TrainConsistMgmt obj = new UseCase18TrainConsistMgmt();

        String[] data = {"BG101"};

        assertTrue(obj.searchBogie(data, "BG101"));
    }
}