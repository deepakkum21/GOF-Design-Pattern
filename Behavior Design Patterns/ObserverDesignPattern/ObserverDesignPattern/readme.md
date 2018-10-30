# Observer Design Pattern
 In this design pattern an object called Subject maintains a list of dependents called Observers and notifies them automatically of any state changes usually by calling one of their methods.

## In simple terms
- Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. 
- **The object that watch on the state of another object are called Observer and the object that is being watched is called Subject.**

## When to use:-
1. Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified          automatically
2. When you need many other objects to receive updates when their is some change in another object.
    1. Stock market with thousands of stocks need to send updates to object representing individual stocks.
    2. The Subject (publisher) sends many stocks to the Observers.
    3. the Observers (subscribers) takes the ones they want and use them.

## Subject:-
1. Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers can register and unregister themselves. 
2. Subject also contain a method to notify all the observers of any change and either it can send the update while notifying the observer or it can provide another method to get the update

## Observer:-
Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates


## Using Java API:
Java provides inbuilt platform for implementing Observer pattern through **java.util.Observable** class and **java.util.Observer interface**. However it’s **not widely used** because the implementation is really simple and most of the times **we don’t want to end up extending a class just for implementing Observer pattern as java doesn’t provide multiple inheritance in classes**.


## Real Time Implementation example:
1. **Java Message Service (JMS)** uses Observer design pattern along with Mediator pattern **to allow applications to subscribe and publish data to other applications.**
2. **Model-View-Controller (MVC)** frameworks also use Observer pattern where **Model is the Subject and Views are observers that can register to get notified of any change to the model**.


## Advantages:
1. Loose coupling is benefit
2. The subject(Publisher) doesnot need to know everything of the observer(Subscriber)

## Disadvantage:
1. The Subject(Publisher) may send updates that don't matter to the Observer(Subscriber)

### example 1
![ex 1](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Behavior%20Design%20Patterns/ObserverDesignPattern/ObserverDesignPattern/images/Observer%20Design%20Pattern%201.PNG) 

### example 2
![ex 2](https://github.com/deepakkum21/GOF-Design-Pattern/blob/master/Behavior%20Design%20Patterns/ObserverDesignPattern/ObserverDesignPattern/images/Observer%20Design%20Pattern%202.PNG)
