# Lesson Overview

In this lesson, we will be learning about some common class types provided by the Java API. These types provide some incredibly helpful functionality that we'll need if we are to start building professional apps. The specific types we will be covering are:

* ***Exceptions***, which help us handle errors.
* ***Enums***, which help us set variables from a list of predefined values.
* ***Dates and Calendar***, which help us store and retrieve dates.
* ***Regular Expressions (RegEx)*** which help us look for string patterns.
* ***Advanced String*** features, which will help us manipulate and process strings more efficiently.

## Exceptions

### The Error Class and the Exception Class

The Java error-handling framework uses two different classes to identify abnormal software events:

* The ***Error*** class is used to indicate a serious problem that the application should not try to handle.
* The ***Exception*** class is used when there is a less catastrophic event that the application should try to handle.

### The Throwable Class

Both Error and Exception classes inherit from the abstract class throwable. This means that both errors and exceptions will contain:

* The ***type of problem*** – the class type, either Exception or Error
* The ***problem message*** – whatever description you've provided within the class, such as "out of memory"
* The ***stack trace where the exception occurred*** – the order in which things ran and the place in that sequence where the problem occurred (this information is used by developers to track down issues and resolve problems in the code)

### Throwing an Exception

What does it mean to throw an exception?

* When an error occurs within a method, that method creates an Exception object.
* Next, the method hands the Exception off to the JVM runtime system. And that's what we mean when we say that we are throwing an exception. We simply mean that a method hands off an exception to the runtime.

### Checked vs Unchecked

In Java there are two different types of exceptions:

**Unchecked Exceptions**

* Unchecked exceptions are exceptions that are unknown to the compiler.
* Because these exceptions are only known at runtime, they are also referred to as runtime exceptions.
* They are a result of a programming error, typically arithmetic errors (such as division by 0).
* Unchecked exceptions are used when we expect that the caller of the method cannot recover from the exception.

**Checked Exceptions**

* Checked exceptions are known to the compiler.
* If we are calling a method that potentially throws a checked exception, it must be handled (or we will get an error from the compiler).
* Checked exceptions are used when we expect that the caller of the method can recover from the exception.

### Handling Exceptions

To handle exceptions, we need to write an exception handler. This involves three main components:

* A `try` block
* A `catch` block
* A `finally` block

Here's an example:

```java
try {
    read();
}
catch (FileNotFoundException ex){
    ex.getLocalizedMessage();
}
finally {
}

```

In this example, we first `try` to call the read method to read a file. If that doesn't work, the `catch` block throws a `FileNotFoundException`.

* The `try` block contains the code we want to try to run. In the example, we are trying to call the read method:

* A `catch` block is an exception handler that handles one specific type of Exception. In this example. The type of exception we are handling is a `FileNotFoundException` exception:

    Remember, `FileNotFoundException` is a class and—as with all exceptions—it inherits from the Throwable class.

    Inside the `catch` block, we add the code we want to execute when the exception is thrown—in this case, we are calling a method called getLocalizedMessage.
  
* The last component of the handler is the finally block. This is an optional block and, in our example, you can see that it is empty: The finally block is always executed–even if an unexpected error causes the method to terminate early.

### Enums

In many cases when developing software we need to provide a predefined value for a single variable type. Enumerations (or Enums for short) are a special data type of constants that allow a variable to be set from an enumerated list.

#### An Enum is a Class

In Java, the declaration of an Enum defines a class. This class can exist *within another class* or as a *standalone class*.

#### Syntax Example

***Creating an Enum***

```java
enum Stoplight {
  RED,
  YELLOW,
  GREEN
}

```


***Assigning a Variable***

```java
Stoplight myStoplight = Stoplight.RED;
```

***Defining an Enum Inside a Class***

```java
public class Main {
  enum StopLight {
    RED,
    YELLOW,
    GREEN
  }

  public static void main(String[] args) {
    StopLight myStoplight = Stoplight.RED; 
    System.out.println(myStoplight);
  }
}
```

## Dates and Calendar

### The Date Class

The Date class represents a specific instance in time. We can instantiate a new `Date` object like so:

```java
Date date = new Date();
```

### The Calendar Class

The *Calendar* class is an abstract class that provides methods for manipulating date and time. The basic syntax for instantiating a new Calendar object looks like this:

```java
Calendar calendar = Calendar.getInstance();
```

## Regular expressions

***Regular expressions*** (often abbreviated as RegEx) are used to match or find strings based on a specialized syntax.

The `regEx` package in Java contains three classes to support these operations

* Pattern
* Matcher
* PatternSyntaxException.

To use RegEx in Java, we have to do two main theings:

* Create a Pattern based on a specialized syntax
* Use the Matcher to determine if the pattern exists in the String provided

### Syntax Example

Let's look at the example from the video. First, we start by defining a `String` for a valid email address using a regular expression:

```java
String emailRegex = "^(.+)@(.+).(.+)$"
```

Next we use `Pattern`, which provides a compiled instance of a `String` regular expression:

```java
Pattern pattern = Pattern.compile(emailRegex)
```

Finally, we use `Matcher`, which contains all of the state data for matching a character sequence against the `Pattern`:

```java
Matcher matcher = pattern.matcher("jeff@example.com")
```
