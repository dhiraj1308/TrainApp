package test;

import main.UseCase13TrainConsistMgmt;
import main.UseCase13TrainConsistMgmt.Bogie; // 🔥 IMPORTANT
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    private List<Bogie> createSampleBogies() {
        return Arrays.asList(
                new Bogie("B1", 50),
                new Bogie("B2", 70),
                new Bogie("B3", 80),
                new Bogie("B4", 40)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

        List<Bogie> result = obj.filterUsingLoop(createSampleBogies());

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

        List<Bogie> result = obj.filterUsingStream(createSampleBogies());

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

        List<Bogie> loopResult = obj.filterUsingLoop(createSampleBogies());
        List<Bogie> streamResult = obj.filterUsingStream(createSampleBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

        long loopTime = obj.measureLoopTime(createSampleBogies());
        long streamTime = obj.measureStreamTime(createSampleBogies());

        assertTrue(loopTime > 0);
        assertTrue(streamTime > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

        List<Bogie> largeList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            largeList.add(new Bogie("B" + i, i % 100));
        }

        List<Bogie> result = obj.filterUsingLoop(largeList);

        assertNotNull(result);
    }
}