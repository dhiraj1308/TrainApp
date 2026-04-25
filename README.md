# UC9: Group Bogies by Type (Collectors.groupingBy)

## Project Description
The **Train Consist Management App** is a Java application designed to simulate railway operations. This specific module (**UC9**) demonstrates how to transition from basic flat-list filtering to organized data reporting.

In real-world railway administration, managers need to separate passenger bogies from goods bogies or organize cars by class (e.g., AC vs. Sleeper). This project implements that logic using the **Java Stream API**.

---

## Technical Concept: `Collectors.groupingBy`
While standard filtering (`filter()`) reduces a list, `groupingBy` organizes it. It functions similarly to the `GROUP BY` clause in SQL, returning a `Map<K, List<T>>` where:
- **Key (K):** The attribute you are grouping by (e.g., `category`).
- **Value (List<T>):** A list of all objects that match that specific key.

---

## Project Structure
| File | Description |
| :--- | :--- |
| **Bogie.java** | The data model representing a train car with attributes like ID, Type, and Category. |
| **TrainConsistApp.java** | Contains the core logic using `Collectors.groupingBy` to categorize the train consist. |
| **TrainConsistAppTest.java** | JUnit 5 test cases to ensure the grouping logic handles both populated and empty lists correctly. |

---

## How to Run

### 1. Prerequisites
- **Java Development Kit (JDK) 8** or higher.
- A terminal or IDE (IntelliJ, Eclipse, or VS Code).

### 2. Execution
1.  **Compile the classes:**
    ```bash
    javac com/railway/model/Bogie.java com/railway/TrainConsistApp.java
    ```
2.  **Run the application:**
    ```bash
    java com.railway.TrainConsistApp
    ```

---

## Expected Output
When executed, the console will display the bogies organized by their respective categories:

```text
--- Grouped Train Consist ---
Goods: 2 items
  -> G1 [Rectangular]
  -> G2 [Cylindrical]
Passenger: 3 items
  -> B1 [Sleeper]
  -> B2 [AC Chair]
  -> B3 [First Class]