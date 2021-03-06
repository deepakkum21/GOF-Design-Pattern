
# Strategy (Policy Pattern).
Allows one of a family of algorithms to be selected on-the-fly at run-time i.e. a class behavior or its algorithm can be changed at run time.

## Java Api example:
 **Collections.sort()** method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.


## When to use
1. When you want to define class that will have one behavior similar to other behavior in the list
2. When you need to use one several behavior dynamically
*e.g.*
- I want the class Object to choose from
  - Not flying
  - Fly with wings
  - Flying superfast

## Advantages: 
1. Have to reduce long lists of conditional
2. Avoid duplicate code
3. Keeps class changes from forcing other class changes
4. Can hide complicated / secret code from user

## Cons:
1. Increases no of classes and objects

![image](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Behavior%20Design%20Patterns/StrategyDesignPattern/Strategy%20Pattern.PNG)

![demo3](https://cdn.journaldev.com/wp-content/uploads/2013/07/Strategy-Pattern.png)
