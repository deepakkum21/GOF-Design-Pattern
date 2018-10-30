# Observer Design Pattern
 In this design pattern an object called Subject maintains a list of dependents called Observers and notifies them automatically of any state changes usually by calling one of their methods.

## When to use:-
1. Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified          automatically
2. When you need many other objects to receive updates when their is some change in another object.
    1. Stock market with thousands of stocks need to send updates to object representing individual stocks.
    2. The Subject (publisher) sends many stocks to the Observers.
    3. the Observers (subscribers) takes the ones they want and use them.

### example 1
![ex 1](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Behavior%20Design%20Patterns/ObserverDesignPattern/ObserverDesignPattern/images/Observer%20Design%20Pattern%201.PNG) 

### example 2
![ex 2](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Behavior%20Design%20Patterns/ObserverDesignPattern/ObserverDesignPattern/images/Observer%20Design%20Pattern%202.PNG)
