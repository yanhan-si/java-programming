# Defining Classes

## Lesson Overview

In this lesson, we will cover:

What an object is and how we interact with an object's state and behavior.

The distinction between a class and an object.

How to define a class.

How to work with objects, including how to access an object's state by invoking methods on those objects.

What garbage collection is and why it is an important aspect of Java's memory management.

## What is an Object?

So what is an object? Essentially, it is a data structure that we create that bundles together and encapsulates two key things:

* The state of the object (represented by variables)
* The behavior of the object (modeled with methods)
  
This allows us to interact with the components of our application in more intuitive ways, and it also helps protect the methods and variables from being changed in undesirable ways from elsewhere in our code.

### Object-Oriented Programming (OOP)

One of the key characteristics of Java is is that it applies an object-oriented approach. This may be different from other languages you may be familiar with.

Benefits of an object-oriented programming approach include:

* Better software reusability
* Better maintainability
* Reduced cost of developing software

## Classes Versus Objects

A class is like a blueprint for a kind of object. The class defines the state and behavior that an object of that class will have.

A single class can instantiate (or create) multiple objects of the same type. So, objects can also be referred to as instances of the class. Each instance of a class is unique, though they all follow the same blueprint defined in the class.

## Defining a Class

### Parts of a Class Definition

Classes are composed of the following different parts:

* The ***class name***, which is always formatted in UpperCamelCase.
* The ***class variables***, which can be either primitives or object references. Note that you'll want to mark these private to protect your instance variables so other classes do not have direct access to them.
* The ***constructor*** which is a special method used to initialize the object when it is created.
* The ***methods*** used to define the behavior that objects of the class will share.
    * ***Accessor methods*** provide access to instance variables. The names of accessor methods typically start with "get".
    * ***Mutator methods*** allow other objects to change the values. The names of mutator methods start with "set".
    
### Instance Variables vs Class Variables

Note the difference between instance variables and class variables.

* ***Instance Variables*** are state variables that can have unique values for each object.
* ***Class Variables*** are state variables that belong to the class itself, and are the same for every object. The static keyword identifies this variable as belonging to the class (not to individual objects).

## Working with Objects

As we've covered before, one of Java's key characteristics is that it is object-oriented. This means operations are performed on objects and not directly on variables. In this paradigm, we start by creating our classes first, which contain the behavioral logic necessary to perform our operations.

We define the class by:

* Giving it a name
* Setting up the instance variables (states)
* Initializing our instance variables within the constructor
* Defining the methods (behavior)


After writing our code, we are ready to test. To run the test, we create a Driver or Tester class. This is a class that has a main method. (Remember, the main method in Java is a special method and is the entry point to executing code.)

This can all seem very abstract, so next we will walk through an exercise where you'll get some practice working with objects in Java.
