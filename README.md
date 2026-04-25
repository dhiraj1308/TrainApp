Train Consist Management App - UC10
Total Seat Capacity Calculation (Stream Reduce)
Overview
This application simulates a railway management system's ability to calculate the total seating capacity of a train. While previous versions focused on grouping bogies, UC10 introduces numerical aggregation using the Java Streams reduce() operation. This allows railway administrators to perform utilization planning and estimate passenger handling capabilities.

Key Java Concept: reduce()
The reduce() method is a terminal operation that takes a sequence of input elements and combines them into a single summary result by repeated application of a combining operation.

Identity: The initial value (0).

Accumulator: A function that takes two parameters (the partial result and the next element) and returns a new partial result.

Features
Selective Filtering: Only counts seats for passenger bogies (Sleeper, AC Chair, First Class).

Exclusion Logic: Automatically ignores goods bogies (e.g., Rectangular, Cylindrical) that have zero seating capacity.

Stream Processing: Uses a clean, functional approach to handle data collections.

Project Structure
Train.java: Contains the Bogie class definition, the core logic for seat summation, and a main method for demonstration.

TrainTest.java: JUnit 5 test suite to validate the summation logic against various train configurations (mixed bogies, empty lists, etc.).

How to Run
Compile the Application:

Bash
javac Train.java
Run the Main Application:

Bash
java Train
Run Tests:
Ensure you have JUnit 5 in your classpath, then run:

Bash
java -jar junit-platform-console-standalone.jar -cp . --select-class TrainTest
Expected Output
When running the main method, the application will process a sample train consist and output:
Total Passenger Seats in Train: 152