# Lesson Overview

This lesson covers all the major building blocks we need to create a simple Java app:

* Keywords. If we want to build an application in Java, we first must understand the basic vocabulary of the language. Java's keywords will provide us with that core, predefined words of the Java language.
* Variables. Variables will provide us with a way to store data for our application. We'll learn how to use variables in Java and then we'll consider some key ways in which Java variables differ from those of other languages (such as Python).
* Loops. Loops allow us to iterate over data structures, executing the same code repeatedly until a condition is met, making it possible to process large data structures with only a few lines of code.
* Methods. The central idea behind methods is that we want to write a block of code once that we can then re-use many times.
* Access Modifiers. We will learn how to use access modifiers to restrict access to variables and methods, so that users of our applications cannot access all of the data directly and in an unsafe manner.
* Javadoc. How do we know how to communicate with an existing Java application? Or, once we create our own application, how do we share it with others? JavaDoc produces a searchable HTML document that defines the classes and interfaces of an application, making it easy for you or any developer to understand how to use the code.
* Arrays. Arrays will provide us with a way to easily and efficiently store and retrieve collections of data, such as a list of phone numbers.

## Java Keywords

If we want to build an application in Java, we first need to know the basic vocabulary of the language. This vocabulary is made up of what we call keywords.

**Keywords are simply words that have a predefined meaning in the Java language.**

Java has 51 keywords, as shown in the table below.

![](./fig/java_kw.png)

But the key thing to remember is that these words already have a meaning in Java, so they are reserved. That means you cannot use them when you are naming your own variables, methods or classes.

## Variables

***Variables*** are used to store data for our application. A variable is a combination of:

* A location in the computer's memory and
* An associated name that we can use in our code to refer to the data in that memory location

Specifically, variables help us store state data.

***State data is data related to the current state of the program as it is running.***

### Using Variables in Java

To **declare** or **define** a variable in Java, we specify the data type, the name of the variable, and any value we want to store in the variable. For example, here we declare an integer value with the name age that holds the value 42:

int age = 42;

Now when we type the word age in our code, it will refer to this location in memory.

The reason we use the term "variable" is because it is able to vary. After we have declared it, we can easily change the value of the variable as many times as we like:

int age = 42;  
age = 43;  
age = 44;  

These lines are referred to as assignment statements(because we are assigning the value on the right to the variable named on the left) and the = sign is called the assignment operator.

