package test;

import main.UseCase19TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    @Test
    void testBinarySearch_BogieFound() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.binarySearch(data, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(obj.binarySearch(data, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(obj.binarySearch(data, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG101"};

        assertTrue(obj.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {};

        assertFalse(obj.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        UseCase19TrainConsistMgmt obj = new UseCase19TrainConsistMgmt();

        String[] data = {"BG309","BG101","BG550","BG205","BG412"};

        assertTrue(obj.binarySearch(data, "BG205"));
    }
}