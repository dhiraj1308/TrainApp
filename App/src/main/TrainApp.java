package main;

public class TrainApp {

    // 🔹 Bubble Sort Method
    public int[] sortCapacities(int[] capacities) {

        int n = capacities.length;

        // Outer loop → passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if left > right
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        return capacities;
    }
}