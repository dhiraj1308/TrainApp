Goal
The primary objective is to prevent search operations from executing on an empty train by throwing a runtime exception early in the process.

Actor
User

Functional Flow
The User triggers a search operation within the system.

The System performs a state validation check to see if the bogie collection is empty.

If no bogies are available, the System throws an IllegalStateException.

The operation terminates immediately to prevent invalid execution.

The User receives a meaningful error message explaining why the operation failed.

Key Concepts
Defensive Programming
A coding practice where the system validates all conditions and inputs before performing core logic. This ensures that the program does not enter an invalid or unpredictable state.

IllegalStateException
A standard Java runtime exception. It is used to signal that a method has been invoked at an inappropriate time or when the system is not in a valid state for that specific request.

Fail Fast Principle
This design philosophy dictates that the system should report a failure as soon as a problem is detected. By stopping execution immediately, it prevents the "snowball effect" of errors occurring further down the logic chain.

State Validation
The process of verifying that the necessary data (in this case, the bogies) exists before the search logic begins.

Technical Requirements
Validate the bogie collection status before initiating search logic.

Implement a conditional check (if-statement) for the validation step.

Throw a new IllegalStateException with a clear message if the collection is empty.

Ensure the search logic is unreachable if the exception is triggered.

Benefits
Reliability: Prevents the system from processing null or empty data sets.

Explicit Errors: Provides clear, readable error messages for developers and users.

Maintainability: Makes the code easier to debug by pinpointing exactly where the state failed.

Real World Practice: Introduces industry-standard defensive coding habits and runtime exception management.