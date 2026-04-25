package main;

import java.util.Arrays;

public class TrainApp {

    // 🔹 Binary Search Method
    public boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // 🔥 Ensure sorted (important requirement)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = bogieIds[mid].compareTo(key);

            if (compare == 0) {
                return true; // found
            } else if (compare < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}