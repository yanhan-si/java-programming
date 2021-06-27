##  Introduction to Functional Programming

Here are some topics covered in this lesson

* Comparing and contrasting imperative and functional programming styles, and understanding when one style might be preferrable over the other.
* Using functional interfaces and lambdas to create shorter, easier-to-read Java code.
* Using the Stream API to process data and aggregate the results into Java collections.

### Imperative Code

Early Java programs were usually programmed in the imperative style. Imperative code usually focuses on ***how a task is performed***. Each line of code gives a specific procedure or operation:

```java
int getTopScore(List<Student> students) {
 int topScore = 0;
 for (Student s : students) {
   if (s == null) continue;
   topScore = Math.max(topScore, s.getScore());
 }
 return topScore;
}
```

* Focuses on how a task is performed.
* Each line of code gives a specific procedure or operation.

### Functional Code

Starting with version 8, Java added language features to support a more functional style of programming. You might also hear some people call it declarative programming.

Functional code focuses on what happens to inputs in order to produce outputs. You can think of it as describing how to get from the input to the output:

```java
int getTopScore(List<Student> students) {
 return students.stream()
     .filter(Objects::nonNull)
     .mapToInt(Student::getScore)
     .max()
     .orElse(0);
}
```

This code does the exact same thing as the last code example, but it uses a more functional programming style, because it:

* Focuses on what happens to inputs in order to produce outputs..
* Describes how to transform the input into the output.

#### Functional vs Imperative Code

* There is nothing wrong with either imperative or functional styles of programming.
*  Anything you can do with one, you can do with the other.
*  Whether to use one or the other often boils down to your specific scenario, and your personal preference as a programmer.

### Using Lambda Expressions

#### Lambda Expressions

***Lambdas*** are a Java language feature that make it very easy to implement certain kinds of interfaces in Java.

#### Code from the Demo

```java
import java.util.List;
import java.util.function.Predicate;

public final class LambdasMain {

    /**
     * Returns the number of strings that match a given condition.
     *
     * @param input the strings that should be tested.
     * @param condition the condition that strings should be tested against.
     * @return the number of strings in the input that match the condition.
     */
    public static long countMatchingStrings(List<String> input, Predicate<String> condition) {
        return input.stream().filter(condition).count();
    }

    public static void main(String[] args) {

        List<String> input = List.of("hello", "\t   ", "world", "", "\t", " ", "goodbye", "  ");

        long numberOfWhitespaceStrings =
                countMatchingStrings(input, s -> s.trim().isEmpty());

        System.out.println(numberOfWhitespaceStrings + " whitespace strings");
    }
}
```

```java
BinaryOperator<Integer> add =
   (Integer a, Integer b) -> { return a + b; };

System.out.println(add.apply(1, 2));
```

### Functional Interfaces

*Only certain kinds of interfaces* can be implemented by lambdas. Those interfaces are called ***functional interfaces***.

A ***functional interface*** is a Java interface with **exactly one abstract method**, called the functional method.

#### Example

```java
@FunctionalInterface
public interface Predicate<T> {
  boolean test(T t);
  default Predicate<T> negate() { return (t) -> !test(t); }

  // Other methods left out of this example
}
```  
The `Predicate` interface from the demo you saw earlier was a functional interface.  
Notice that functional interfaces are Java interfaces, and just like a non-functional Java interface, they are allowed to have type parameters. Here, `Predicate` has one type parameter `T`, which is the type being tested.  
`Predicate`'s one abstract method is `test()`.
`test()` is known as the ***functional method***.
"Abstract" means the method is not implemented, so in order to be a functional method, it cannot have a default implementation.
However, functional interfaces can have other default methods. In this case,
the `Predicate` interface has a default method called `negate()` that returns another `Predicate`.

The `@FunctionalInterface` annotation at the top serves two important purposes:

* If that annotation is added to any interface that is not a valid functional interface, the Java compiler will report a compilation error.
* It tells whoever is reading the code that this is interface is designed to be used with lambdas.

That's why if you intend for an interface to be functional, you should always add the `@FunctionalInterface` annotation.

When you're designing a Java interface, you should consider making it a functional interface if it describes a single operation.

### Exercise: Binary Operations

***Binary operation is a fancy term that refers to a method that takes two arguments.***

#### Defining a Functional Interface

`BinaryOperation.java`

```java
@FunctionalInterface
public interface BinaryOperation {
  int apply(int a, int b);
}
```

`Main.java`

```java
public final class Main {
  public static void main(String[] args) {
    BinaryOperation add = (a, b) -> a + b;
    // Or you could use:
    //
    //  BinaryOperation add = Integer::sum;
    //
    // More on method references later!

    assert 5 == add.apply(2, 3);
  }
}
```

#### Alternative Solution

If you were paying really close attention, you may have noticed you can avoid creating a custom functional interface altogether — just use `java.util.function.BinaryOperator` with a type parameter of `Integer`! Then your `Main.java` method would look like this:

`Main.java`

```java
public final class Main {
  public static void main(String[] args) {
    BinaryOperator<Integer> add = (a, b) -> a + b;
    assert 5 == add.apply(2, 3);
  }
}
```  
[java.util.function](!https://docs.oracle.com/javase/10/docs/api/java/util/function/package-summary.html)

### Anonymous Subclasses

An **anonymous class** is a class that is defined "in-line" and has no name, and so it is called "anonymous".

Nowadays, many anonymous classes can be replaced by lambdas, but there are still some important differences you should know about:

#### Anonymous Class vs. Lambda

This anonymous class...

```java
Predicate<String> anonymousSubclass =
   new Predicate<String>() {
     @Override
     public boolean test(String s) {
       return s.trim().isEmpty();
     }
   };
```

... does the same thing as this lambda expresssion:

```java
Predicate<String> lambdaInstead = s -> s.trim().isEmpty();
```

![](../fig/Lambdas.png)

### What's `this` all about?

Let's take a closer look at that last row in the table. `this` inside an anonymous class refers to the anonymous class, whereas `this` inside a lambda refers to the enclosing class. What does that mean exactly?

Consider this example:

```java
public final class ThisExample {
  private final Runnable withLambda =
      () -> System.out.println("From lambda: " + this.getClass());
  private final Runnable withSubclass = new Runnable() {
    @Override
    public void run() {
      System.out.println("From subclass: " + this.getClass());
    }
  };

  public static void main(String[] args) {
    ThisExample thisExample = new ThisExample();
    thisExample.withLambda.run();
    thisExample.withSubclass.run();
  }
}
```

Here's what it printed on my PC:

```
From lambda: class lesson2.functionalInterface.AnonymousSubclassExample
From subclass: class lesson2.functionalInterface.AnonymousSubclassExample$1
```



Inside the lambda, `this.getClass()` returns the class object representing `AnonymousSubclassExample`.
We'll cover class objects in more detail in the lesson on reflection, but for now the important part is that the
`this` keyword inside the lambda references the enclosing class, which is 
`lesson2.functionalInterface.AnonymousSubclassExample`

For the `Runnable` subclass, on the other hand, the program printed 
`lesson2.functionalInterface.AnonymousSubclassExample$1`

### Limitations of Lambdas

#### Shortcomings of Lambdas

Lambdas are very useful, but they do have some shortcomings:

* They can only be used to implement functional interfaces, not classes.
* Lambdas cannot implement any interface that has multiple abstract methods.
* Lambdas cannot throw checked exceptions (any subclass of Exception, such as IOException).

#### Code from the Demo

You can handle checked exceptions with a `try-catch` inside the lambda:  
```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public final class ReadFilesMain {
  public static void main(String[] args) throws IOException {
    List<String> fileNames = Arrays.asList("file-a.txt", "file-b.txt", "file-c.txt");

    fileNames.stream()
        .map(Path::of)
        .map(p -> {
          try {
            return Files.readAllLines(p, StandardCharsets.UTF_8)
          } catch (IOException e) {
            return List.of();
          }
        })
        .flatMap(List::stream)
        .forEach(System.out::println);
  }
}
```

... or with a `for` loop:

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public final class ReadFilesMain {
    public static void main(String[] args) throws IOException {
        List<String> fileNames = Arrays.asList("file-a.txt", "file-b.txt", "file-c.txt");

        for (String fileName : fileNames) {
            for (String line : Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)) {
                System.out.println(line);
            }
        }
    }
}
```

