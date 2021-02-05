# strategy-pattern

Question
You have been hired by the company “Numerical Solutions Inc” and you
are in charge of their new project “LinearSolverDeluxe”.
The project’s objective is to design and implement a Java application with a single functionality: it
admits as input from the user a system of linear equations and outputs its solution, if it exists, or an
error message otherwise.
The customer:
- wants the software to support at least two methods of solving linear equations: Gaussian
elimination and matrix inversion.
- wants to be able to change between solving methods dynamically.
- might need more functionalities in the future (e.g. determinant calculation, etc).
You will:
- Provide the class diagrams with the appropriate arrows and contents (in detail; all the methods and
variables involved with the appropriate access rights), that satisfies the customer’s requirements;
strive for maximum flexibility, loose coupling and minimize maintenance costs!
- Implement in Java the above software (user interfacing technique, way of admitting input, way of
outputting, that’s all up to you).



report
The customer may request other equations instead of
linear equation in the future.
So I installed a generic equation abstract class.
For now, there is only the performLinearEquation method, but
if you want other possible methods in the future, I left it
available to open new methods over this class.
This will give me flexibility in the future.
Since its linearEquation is also found in the related classes,
other types of equations can be added at a later time.
Since the user wants to dynamically change equation methods
at runtime, I solved this problem with strategy design pattern.

