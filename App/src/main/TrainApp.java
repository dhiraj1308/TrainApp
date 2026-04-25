package main;

import java.util.*;
import java.util.stream.Collectors;

public class TrainApp {

    // 🔥 INNER STATIC CLASS (KEY FIX)
    public static class Bogie {
        private String id;
        private int capacity;

        public Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getId() {
            return id;
        }
    }

    // 🔹 Loop-based filtering
    public List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // 🔹 Stream-based filtering
    public List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // 🔹 Measure loop time
    public long measureLoopTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterUsingLoop(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    // 🔹 Measure stream time
    public long measureStreamTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterUsingStream(bogies);
        long end = System.nanoTime();
        return end - start;
    }
}