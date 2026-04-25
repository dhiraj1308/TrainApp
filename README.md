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

Sigeni Tejas RA2411003011282