package test;

import main.UseCase16TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    @Test
    void testSort_BasicSorting() {
        UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, obj.sortCapacities(input));
    }

    @Test
    void testSort_AlreadySortedArray() {
        UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, obj.sortCapacities(input));
    }

    @Test
    void testSort_DuplicateValues() {
        UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        assertArrayEquals(expected, obj.sortCapacities(input));
    }

    @Test
    void testSort_SingleElementArray() {
        UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

        int[] input = {50};
        int[] expected = {50};

        assertArrayEquals(expected, obj.sortCapacities(input));
    }

    @Test
    void testSort_AllEqualValues() {
        UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        assertArrayEquals(expected, obj.sortCapacities(input));
    }
}