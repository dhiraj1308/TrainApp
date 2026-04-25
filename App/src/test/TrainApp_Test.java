package test;

import main.UseCase17TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmtTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        UseCase17TrainConsistMgmt obj = new UseCase17TrainConsistMgmt();

        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        assertArrayEquals(expected, obj.sortBogieNames(input));
    }

    @Test
    void testSort_UnsortedInput() {
        UseCase17TrainConsistMgmt obj = new UseCase17TrainConsistMgmt();

        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        assertArrayEquals(expected, obj.sortBogieNames(input));
    }

    @Test
    void testSort_AlreadySortedArray() {
        UseCase17TrainConsistMgmt obj = new UseCase17TrainConsistMgmt();

        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        assertArrayEquals(expected, obj.sortBogieNames(input));
    }

    @Test
    void testSort_DuplicateBogieNames() {
        UseCase17TrainConsistMgmt obj = new UseCase17TrainConsistMgmt();

        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        assertArrayEquals(expected, obj.sortBogieNames(input));
    }

    @Test
    void testSort_SingleElementArray() {
        UseCase17TrainConsistMgmt obj = new UseCase17TrainConsistMgmt();

        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};

        assertArrayEquals(expected, obj.sortBogieNames(input));
    }
}