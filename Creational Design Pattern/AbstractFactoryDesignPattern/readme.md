# Abstract Factory Pattern
1. It is similar to **FACTORY PATTERN**  where we had  a single Factory class but in **ABSTRACT FACTORY PATTERN** its more like factory of factories.. 
2. This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this.
3. But in **ABSTRACT FACTORY PATTERN** we get rid of if-else block and have a factory class for each sub-class.
4. Then an Abstract Factory class that will return the sub-class based on the input factory class. 

## Advantages:
1. It provides approach to code for interface rather than implementation.
2. It is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
3. It is robust and avoid conditional logic of Factory pattern.

## Examples in JDK
- javax.xml.parsers.DocumentBuilderFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.xpath.XPathFactory#newInstance()

## example:
![demo1](https://cdn.journaldev.com/wp-content/uploads/2013/05/factory-pattern-java.png)