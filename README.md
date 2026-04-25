Overview
The goal of this use case is to ensure that unsafe cargo assignments (e.g., placing flammable liquids in inappropriate containers) do not crash the application. By implementing custom exceptions and a structured try-catch-finally block, the system maintains stability while providing clear feedback to the user.

Core Functionality
Validation: Checks the compatibility between the cargo type and the bogie shape.

Safety Rule: Petroleum products must not be assigned to rectangular bogies (Safety Hazard).

Error Handling: Uses a custom CargoSafetyException to interrupt unsafe operations.

Cleanup: Uses a finally block to ensure all operations are logged, regardless of success or failure.

🛠️ Key Technical Concepts
Custom Runtime Exception: A domain-specific exception (CargoSafetyException) that extends RuntimeException.

throw Keyword: Explicitly triggers the exception when a safety violation is detected.

try-catch-finally: * try: Wraps the cargo assignment logic.

catch: Intercepts the CargoSafetyException to prevent a crash.

finally: Executes mandatory logging/cleanup.

💻 Implementation Guide
1. Define the Custom Exception
   Java
   public class CargoSafetyException extends RuntimeException {
   public CargoSafetyException(String message) {
   super(message);
   }
   }
2. Cargo Assignment Logic
   When assigning cargo, the system must validate the "Petroleum vs. Rectangular" rule:

Java
public void assignCargo(String cargoType, String bogieShape) {
try {
System.out.println("Attempting to assign " + cargoType + " to " + bogieShape + " bogie...");

        if (cargoType.equalsIgnoreCase("Petroleum") && bogieShape.equalsIgnoreCase("Rectangular")) {
            throw new CargoSafetyException("CRITICAL SAFETY VIOLATION: Petroleum cannot be stored in Rectangular bogies!");
        }
        
        System.out.println("Cargo successfully assigned.");
    } 
    catch (CargoSafetyException e) {
        System.err.println("Assignment Failed: " + e.getMessage());
    } 
    finally {
        System.out.println("Cargo assignment process completed. (Logging to System Audit)");
    }
}
📋 Requirements Checklist
[x] Create CargoSafetyException class.

[x] Implement shape and cargo validation logic.

[x] Throw exception if Petroleum is assigned to a Rectangular bogie.

[x] Catch the exception and display a user-friendly error message.

[x] Use a finally block for completion logging.

[x] Verify the application continues running after a caught exception.

🚀 Benefits
System Stability: Prevents "Blue Screen" or crash scenarios during invalid user input.

Operational Safety: Enforces real-world railway safety standards through code.

Audit Trail: The finally block ensures every attempt is recorded for safety audits.

Note: This implementation focuses on Runtime Exceptions (unchecked), meaning the compiler does not force you to catch them, but the application logic requires it for graceful failure handling.