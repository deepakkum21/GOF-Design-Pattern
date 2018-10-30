# Observer Design Pattern
 In this design pattern an object called Subject maintains a list of dependents called Observers and notifies them automatically of any state changes usually by calling one of their methods.

## When to use:-
1. Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified          automatically
2. When you need many other objects to receive updates when their is some change in another object.
    a. Stock market with thousands of stocks need to send updates to object representing individual stocks.
    b. The Subject (publisher) sends many stocks to the Observers.
    c. the Observers (subscribers) takes the ones they want and use them.
    
