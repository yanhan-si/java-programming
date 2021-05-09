# Lesson Overview

In this lesson, we will be learning how to use `generics` and `collections`:

* ***Generics*** are a way to parameterize class types into classes, methods and variables so that we eliminate the need for casting, have stronger type checks at compile time, and develop generic algorithms.
* ***Collections*** are data structures that were created to provide improved interoperability and performance. Collections provides a more effective framework and architecture for storing, retrieving, and processing data.

## Generics

***Generics*** allow us to write methods that handle a whole group of different data types—in other words, to write methods that are generic.

The benefits of using Generics are:

* Stronger type checks at compile time.
*  They remove the need to cast objects.
*  They allow developers to implement generic algorithms.

Put another way, generics are a way to parameterize class types into classes, methods, and variables.

### Syntax Example

Here is some code that creates a list of strings without using generics:

```java
List strings = new List();
```

How do we know what’s in this list? The list is called `strings`, but that is just the name we chose. We would need to cast the items in order to use them as String types.

With generics, we can identify what types are stored in the list. The syntax for a generic is very simple—it's just bracket with the type inside, `< type >`. So in this example, we can add `<String>` right next to `List` to identify what types are stored in the list:

```java
List<String> strings = new <String>ArrayList();
```

Because we've used generics to identify the items in the list as Strings, we could now call methods directly on them without having to first cast them.

## Collections

***Collections*** are a set of data structures that were introduced in Java 5.0 to solve problems with consistency between data structures and to address performance issues. They were developed with the following goals in mind:

* ***High performance/efficiency***.
* ***High degree of interoperability***. The new data structures all needed to behave similarly to each other. In practice, this means that Collections data structures implement similar interfaces and extend similar abstract classes.
* ***Integrate with existing APIs seamlessly***. The Java framework had to extend and adapt to the new data structures easily. They needed to integrate the new data structures seamlessly with little disruption to the existing API.

### Syntax Example

The Collections framework consists of several different data structure classes like `List`, `Maps` and `Queues`.
In addition, there are utility classes like `Collections` and `Arrays` that provide methods for sorting and creating empty lists.
Below is an example in which we create a `List` of type `String` and then add and remove data.

***Notice: We are creating an instance of `List` but we are using an `ArrayList` to insatiate it. This is because `List` is an Interface and we must use a concrete class to instantiate the object.***

```java
List<String> myList = new ArrayList<String>();

myList.add("one");
myList.add("two");
myList.add("three");

//We could also remove the element "one" by using the index 0 instead of the value "one".
myList.remove("one");

```

## Sorting Collections

The `collections` framework provides a `sort` method that can be used to sort lists containing the following types of objects:

* Strings
* Wrapper objects
* User-defined classes

### Strings

A list of Strings can be sorted by simply passing the list to the Collections.sort() method. In the example bellow, the names will be sorted in ascending order.

```java
   List<String> names = new LinkedList<String>();

    names.add("Mike");
    names.add("Bob");
    names.add("Alice");

    Collections.sort(names);
```

### Wrapper Objects

Wrapper objects were introduced in Java to wrap primitive variable types into objects. In the example below, the primitive int values are being converted to Integer objects and then sorted.

```java
List<Integer> numbers = new LinkedList<Integer>();

    numbers.add(201);
    numbers.add(100);
    numbers.add(101);

    Collections.sort(numbers);
```

### User-Defined Classes

User-defined classes will need to implement the `Comparable` Interface in order to use the `Collections.sort()` method.
The *Comparable* Interface provides a method, `compareTo`, which is used to compare two objects of the same type.
In the example below we are using the Person object's `name` field to compare Person objects.
This line of code, `name.compareTo(person.name)`, handles all of the hard work.

```java
import java.util.*;  

class Person implements Comparable<Person> {  
  public String name;  
  public Person(String name) {  
    this.name = name;  
  }  
  public int compareTo(Person person) {  
    return name.compareTo(person.name);  

  }   
}  
public class PersonSort {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Same"));
    people.add(new Person("Mike"));
    people.add(new Person("Apple"));

    Collections.sort(people);
    for (Person person : people) {
      System.out.println(person.name);
    }
  }
}
```