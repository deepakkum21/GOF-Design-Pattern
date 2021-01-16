# GOF-Design-Pattern
Design Pattern By Gangs Of Four:-

## 1. Structural
### a. Facade Design Pattern (SL4J)
### b. FlyWeight degign Pattern (String)
- Flyweight design pattern is used when we need to create a lot of Objects of a class. 
- Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects.
- Before we apply flyweight design pattern, we need to consider following factors:

	- The number of Objects to be created by application should be huge.
	- The object creation is heavy on memory and it can be time consuming too.
	- The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program.

- To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties. 
- Intrinsic properties make the Object unique whereas extrinsic properties are set by client code and used to perform different operations. 
- For example, an Object Circle can have extrinsic properties such as color and width. 
	- Suppose in a text editor when we enter a character, an object of Character class is created, the attributes of the Character class are {name, font, size}. We do not need to create an object every time client enters a character since letter ‘B’ is no different from another ‘B’ . If client again types a ‘B’ we simply return the object which we have already created before. Now all these are intrinsic states (name, font, size), since they can be shared among the different objects as they are similar to each other.
	- Now we add to more attributes to the Character class, they are row and column. They specify the position of a character in the document. Now these attributes will not be similar even for same characters, since no two characters will have the same position in a document, these states are termed as extrinsic states, and they can’t be shared among objects.

### Proxy Design Pattern (Java API: java.rmi.*)

