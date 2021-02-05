# strategy-pattern


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

