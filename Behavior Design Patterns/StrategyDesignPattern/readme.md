
# Strategy.
Allows one of a family of algorithms to be selected on-the-fly at run-time.


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


