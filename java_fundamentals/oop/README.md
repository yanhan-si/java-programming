# Lesson Overview

In this lesson we will be covering:

* ***Packages***, which are essentially like folders you can use to organize your code and identify exactly which file (or class) you are referring to.
* ***Inheritance***, where one class acquires properties and methods from another class.
* ***Abstract classes***, which cannot be directly instantiated themselves, but that allow us to define the behavior for each of the subclasses.
* ***Interfaces***, which support decoupling and allow us to avoid hardcoding features in an application.
* ***Polymorphism***, which is the ability for an object to take on many forms.

## Packages

In Java, we use packages to organize and manage our Java files:

* If you are used to the concept of namespaces, packages serve essentially the same purpose in Java.
* Packages are not unlike the traditional folders that you use every day on your computer for organizing your files.
* By nesting packages and files, we can create a hierarchy that allows us to identify specific files and avoid naming conflicts.

The package keyword will be located at the top of a Java file, typically on the first line of the file, before the imports and class name.
For example:

package project.src.api

## Inheritance

Inheritance is one class acquiring properties and methods from another class. Here are some key points you should remember about inheritance:

* We want to go from general to specific. The parent or superclass is the most general and the child or subclass is the more specific.
* By extending the superclass you are stating that the subclass is of the superclass type. When we're not sure if a subclass is inheriting from a parent class, we can use the “is a” test (e.g. a car is a vehicle).
* The relationship between superclass and subclasses is only one way. The subclasses need to know about the superclass, but the superclass should never know anything about its subclasses.

### The ***Object*** Superclass

Every class inherits from the superclass Object. Because all objects inherit from the Object class, there are some methods that all objects have, no matter what types they are. For example, all objects have:

* clone(), so that we can clone or make a copy of any object.
* equals(), which we can use to determine if two objects are the same.
* hashCode(), which provides a unique hash code for each object. This is something we'll make use of later on when we need to store and retrieve objects in specific data sets.
* toString(), which we can use to get a description of the current state of an object.

## Polymorphism

Polymorphism is the ability of an object to take on many forms.

In Java, any kind of inheritance can be used to support polymorphism. In our vehicle example, each of the vehicles has two forms—for instance, a Car object is both a Car and also a Vehicle (since it inherits from the Vehicle class). Any Car object thus has two forms. This is polymorphism.

If we wanted to get the speed of all the Car, Boat, and Plane objects, we can easily do this because of polymorphism—we simply create a list containing all objects that are of type Vehicle and get the speed on every Vehicle object, regardless of whatever other types that object might be.

Here's what that would look like in code:

```
// Create an array of size 3 and type Vehicle  
Vehicle [] vehicles = new Vehicle[3];

// Instantiate three new objects and add them to the array.  
// It looks like these are all different types (Car, Plane, and Boat),  
// but they all inherit from the Vehicle class, so in addition to the types  
// they get from their subclasses, they are also all Vehicle objects.  
vehicles[0] = new Car();  
vehicles[1] = new Plane();  
vehicles[2] = new Boat();

// Iterate over the array and print the speed  
// of each of the Vehicle objects.  
for (int i = 0; i < vehicles.length; i++) {  
vehicles[i].speed();  
}
```


## Abstract Classes

An abstract class has the following key characteristics:

* It defines the behavior for each of the subclasses, but we cannot directly instantiate the abstract class itself.
* It allows us to create ***abstract methods***.
  * An abstract method is a method that does not contain an implementation body. Instead, it simply provides a header for the method.
  * Subclasses that extend an abstract class are required to override all abstract methods and provide a specific implementation.
    
## Interfaces

Interfaces allow us to avoid hardcoding features in an application. We can move specific implementation details into subclasses, and then use an interface to communicate between the application and the subclasses.

### Interfaces vs Abstract Classes

Here are some of the similarities and differences between abstract classes and interfaces:

***Abstract class***
* Can have class variables.
* Can have both abstract methods and concrete methods that are shared with the subclasses.
* Can have instance variables, i.e. variables that are specific to individual subclasses.
* Subclasses can only extend one class.

***Interfaces***
* Can have class variables.
* Every method in an interface is abstract.
* Cannot have instance variables. Variables in an interface must be the same for every class implementing the interface.
* Classes can implement more than one interface and have multiple inheritance.

### When to Use an Interface

* We expect unrelated classes will be implementing our interface.
* We want to support multiple inheritance.
* We want to specify the behavior for a data type, but we do not care about the implementation.

