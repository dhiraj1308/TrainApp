system simulation. current read me cahgen and give i will copy apste thats it

Here’s your UPDATED README (UC1 → UC12) — clean, structured, and ready to copy-paste 👇

🚆 Train Consist Management App
📌 Overview
The Train Consist Management App is a console-based Java application that simulates how railway systems manage a train’s consist — the sequence of bogies attached to an engine.

This project demonstrates Core Java, Data Structures, Streams, Regex, and OOP concepts through real-world railway scenarios.

🎯 Features
Manage passenger and goods bogies
Track seating and load capacities
Ensure uniqueness of bogies
Maintain train formation order
Map bogies to operational attributes
Sort bogies based on capacity
Filter and group bogies using Streams
Calculate total seating capacity
Validate Train ID and Cargo Codes using Regex
Enforce safety compliance rules for goods bogies
🏗️ Concepts Covered
Use Case	Concept
UC1	Application setup, ArrayList initialization
UC2	ArrayList operations (add, remove, contains)
UC3	HashSet (uniqueness)
UC4	OOP (Bogie class, objects)
UC5	LinkedHashSet (order + uniqueness)
UC6	HashMap (key-value mapping)
UC7	Comparator (custom sorting)
UC8	Stream API – filter()
UC9	Stream API – groupingBy()
UC10	Stream API – map() + reduce()
UC11	Regex validation (Pattern & Matcher)
UC12	Stream API – allMatch() (safety compliance)
📂 Project Structure
TrainConsistManagement/ │ ├── App/ │ └── src/ │ └── TrainConsistManagement.java │ ├── .gitignore └── README.md

🚀 How to Run
Open project in IntelliJ / Eclipse
Navigate to:
App/src/TrainConsistManagement.java

Right-click → Run
OR using terminal:

javac TrainConsistManagement.java
java TrainConsistManagement
🧪 Sample Functionalities
✅ Add Passenger Bogies
Sleeper
AC Chair
First Class
✅ Ensure Unique Bogies
Duplicate bogies automatically ignored using HashSet
✅ Maintain Order
Train formation preserved using LinkedHashSet
✅ Map Capacity
Sleeper → 72
AC Chair → 50
First Class → 30
✅ Sort Bogies
Sorted using Comparator based on capacity
✅ Filter Bogies (UC8)
Display bogies with capacity > threshold using filter()
✅ Group Bogies (UC9)
Group by type using groupingBy()
✅ Total Capacity (UC10)
Calculate total seats using map() + reduce()
✅ Regex Validation (UC11)
Train ID → TRN-1234
Cargo Code → PET-AB
✅ Safety Compliance (UC12)
Cylindrical bogies must carry Petroleum only
Validated using allMatch()
📊 Sample Output
=== Train Consist Management App ===

All Bogies:
Sleeper (Capacity: 72)
AC Chair (Capacity: 50)
First Class (Capacity: 30)

Total Seating Capacity: 152

Grouped Bogies:
Sleeper → [Sleeper (Capacity: 72)]
AC Chair → [AC Chair (Capacity: 50)]

Train ID is VALID
Cargo Code is VALID

Train is SAFETY COMPLIANT
💡 Key Learnings
Difference between List, Set, and Map
Importance of uniqueness in real systems
Object-Oriented design using classes
Custom sorting using Comparator
Functional programming using Streams
Data validation using Regex
Real-world business rule enforcement
🔧 Technologies Used
Java (JDK 17+ / 21+)
Collections Framework
Stream API
Regex (Pattern & Matcher)
👨‍💻 Author