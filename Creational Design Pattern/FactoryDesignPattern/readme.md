# Factory Design Pattern (Factory Method Design Pattern):-
1. Factory design pattern is used when we have a **super class with multiple sub-classes and based on input, we need to return one of the sub-class**. 
2. This pattern take out the responsibility of **instantiation of a class from client program to the factory class**.

### In simple terms:
When you are gettin an object by calling method of other object that method is returning that object which you want.

## When to use
1. When you don't know which class object you need.
2. When all of the potential classes are in the same subclass hierarchy.
3. To centralize class selection code.
4. When you don't want the user to know every subclasses.
5. To encapsulate object creation.

## Examples in JDK
- java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
- **valueOf()** method in wrapper classes like Boolean, Integer etc.

## Advantage:

## example
![demo1](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Creational%20Design%20Pattern/FactoryDesignPattern/images/Factory%20Pattern%202.PNG)
![demo2](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Creational%20Design%20Pattern/FactoryDesignPattern/images/Factory%20Pattern%201.PNG)
