# Singleton Design Pattern
1. This restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
2. It must provide a global access point to get the instance of the class.

## uses:-
1. It is used for **logging, drivers objects, caching and thread pool.**
2. It is also used in other design patterns like **Abstract Factory, Builder, Prototype, Facade etc.**
3. In core java classes, for example **java.lang.Runtime** 

## Singleton Implementation Common things:-
- **Private constructor** to restrict instantiation of the class from other classes.
- **Private static variable** of the same class that is the only instance of the class.
- **Public static method** that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

## Diiferent Ways To Implement the Singleton Pattern:-
1. Eager initialization
2. Static block initialization
3. Lazy Initialization
4. Thread Safe Singleton
5. Bill Pugh Singleton Implementation
6. Enum Singleton
7. Serialization and Singleton

### Eager Initialization:-
- the instance of Singleton Class is **created at the time of class loading**.
- *Drawback* - instance is created even though client application might not be using it.
- *When to use* - class is not using a lot of resources.
- *Ideally* - Should not use this type of implementation as most of the type singleton pattern is created for resources such as File System, Database connections etc    and we should avoid the instantiation until unless client calls the getInstance method

### Static Block Initialization:-
- This implementation is similar to eager initialization, except that instance of class is **created in the static block that provides option for exception handling.**
- *advantage* provides option for exception handling over Eager initialization.
- *drawback* same as of eager initialization

### Lazy Initialization:-
- This creates the **instance in the global access method**. 
- *advantage* - This would only create the instance only if the client calls even for the first time but wouldn't create if client don't need unlike in eager or static block initialization.
  - good for classes having lot of resources.
- *Suited best for* - **single thread environment**
- *drawback* - **should not be used for multi-threaded environment**
  - It can cause issues if multiple threads are inside the if loop at the same time.
  - It will destroy the *singleton pattern and both threads will get the different instances* of singleton class

### Thread Safe Singleton:-
- The easier way to create a thread-safe singleton class is to **make the global access method synchronized**, so that only one thread can execute this method at a time.
- *Drawback* -  it reduces the performance because of cost associated with the synchronized method
  - To avoid this extra overhead every time, **double checked locking principle is used**.
  - ***DOUBLE CHECKED LOCKING*** - the synchronized block is used *inside the if condition with an additional check* to ensure that only one instance of singleton class is created.

### Bill Pugh Singleton Implementation
- Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in certain scenarios where too many threads try to get the instance of the Singleton class simultaneously.
- To solve this problem, Bill Pugh came up with a different approach to **create the Singleton class using a inner static helper class**.
- *private inner static class* that contains the instance of the singleton class.
  - *advantage* - **When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method**, this class gets loaded and creates the Singleton class instance. thus solving the problem of memory.
- Most widely used method to create the Singleton Pattern.

### Serialization and Singleton:-
- Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store it’s state in file system and retrieve it at    later point of time.
- *drawback* - The problem with above serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.
- *solution* -  **provide the implementation of readResolve() method.**