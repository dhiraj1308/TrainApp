Description
This application module focuses on enforcing domain safety rules for Goods Bogies. It addresses the risks associated with assigning incorrect cargo types to specific bogie shapes to prevent leaks and derailment risks.

Safety Rules Implemented

Cylindrical Bogies: Only permitted to carry liquid or hazardous cargo like Petroleum and Chemicals.

Rectangular Bogies: Only permitted to carry dry bulk cargo like Grain and Coal.

How to Run

Compile the main application: javac TrainSafetyApp.java

Run the main application: java TrainSafetyApp

Compile the test suite: javac SafetyComplianceTest.java

Run tests with assertions enabled: java -ea SafetyComplianceTest