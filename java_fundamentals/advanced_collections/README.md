# Lesson Overview

In the previous lesson we learned about the Collection interface. In this lesson we will be learning about some additional, more ***advanced collections***:

* ***Maps*** are collections that use *key-value* pairs, making it possible for us to find an element more efficiently (in *constant time* rather than *linear time*).
* ***Sets*** are collections that avoid duplicate elements.
* ***Queues*** are collections that support a *First-In, First-Out* order, so that we can process elements in the order they arrive.

These three collection types are very different from one another, but each of them provides a uniquely powerful data structure that, when used correctly, can solve complex problems efficiently.

## Maps

*With Maps: Constant Lookup Time*

### `Map` is an Interface

The Java `Map` is an Interface that provides three different distinct views of the data:

* A list of the keys
* A list of the values
* A set of key-value mappings

### Map Syntax

Let's go over the basic syntax for creating and using maps.

***Creating a Map Object***

In the Collections framework, the Map is an interface and cannot be directly used to instantiate a class. In the example below, we are creating a Map of people. Notice that we are using the concrete class HashMap to instantiate our Map object.

```java
Map<String, Person> mapOfPeople = new HashMap<String, Person>();
```

***Adding to a Map***

Next we will look at adding objects to our Map. Remember that a Map takes a key-value pair. So when we add an object we will be adding the key and the value. In the example below we are using the email as the key and the value will be our Person object. To add to the Map we use the `put` method.

```java
Person mike = new Person("Mike", "mike@email.com");
Person shaun = new Person("Shaun", "shaun@email.com");
Person sally = new Person("Sally", "sally@email.com");
Person cesar = new Person("Cesar", "cesar@email.com");

mapOfPeople.put(mike.getEmail(), mike);
mapOfPeople.put(shaun.getEmail(), shaun);
mapOfPeople.put(sally.getEmail(), sally);
mapOfPeople.put(cesar.getEmail(), cesar);
```

***Retrieving an object from a Map***

In this example, we will be looking at the syntax to retrieve a Person object from the Map using an email as the key.

```java
mapOfPeople.get("mike@email.com");
```

***Iterating over a Map***

In our final example, let's see how we can iterate over our Map using a `for-each` loop. Remember that each Map has three distinct views for seeing the data. We can get the keys, the values, or key-value mapping. In the example below we are displaying all of the keys for our Map.

```java
for (String email : mapOfPeople.keySet()) {
    System.out.println(email);
}
```

## Sets

*A Set is a collection type that has no duplicate values.*

### Concrete Implementations

There are three concrete implementations for the Set interface:

* HashSet
* TreeSet
* LinkedHashSet

Each of these implementations vary, but all of them enforce the no-duplicate-values requirement of the Set interface.

***Note: Above, we referred to these as "concrete implementations". Remember, "concrete" means that they are not interfaces or abstract classes, and they contain all of the code necessary per the interface.***

### Set Syntax

Here are the syntax examples we just looked at for creating and using sets

***Creating a Set Object***

In the Collections framework, the Set is an interface and cannot be directly used to instantiate a class. In the example below we are creating a Set of strings. Notice, we are using the concrete class HashSet to instantiate our Set object.

```java
Set<String> mySet = new HashSet<String>();
```

***Adding to a Set***

Next we will look at adding objects to our Set. Remember that a Set has an additional restriction that no duplicate values are allowed. In this example we are adding Strings to our Set using the `add` method:

```java
mySet.add("Hello");
mySet.add("Hello");
mySet.add("Hellos");
```
Even though we used `add` three times, this will actually only add two items, since one of the items is a duplicate.

***Retrieving an object from a Set***

In this example we will be looking at the syntax to retrieve a String object from our Set. Unfortunately, the only way retrieve an object from a Set is to iterate over the Set looking for the object. Below we are iterating over the Set to look for the "Hello" String. This example is simple but provides the necessary techniques for finding an object in a Set.

```java
String foundObject;

for (String text : mySet) {
    if(text.equals("Hello"){
        foundObject  = text;
    }
}
```

## Queues

*First-In, First-Out (FIFO)*



Some key points about Queues in Java:

* Queue is an *interface* that implements the Collection interface
* We *put* newly added elements at the *end* of the queue
* We *pop* elements off the *front* of the queue

### Queues Syntax

For your reference, here are some basic syntax examples for creating and using queues.

***Creating a Queue Object***

In the Collections framework, the Queue is an interface and cannot be directly used to instantiate a class. In the example below, we are creating a Queue of strings. Notice that we are using the concrete class `LinkedList` to instantiate our Queue.

```java
Queue<String> myQueue = new LinkedList<String>();
```

***Adding to a Queue***

Next we will look at adding objects to our Queue. 

```java
myQueue.add("Hi");
myQueue.add("There");
```

***Retrieving an object from a Queue***

In this example we will be looking at the syntax to retrieve a String object from our Queue. Remember, Queues are First-In, First-Out (FIFO) data structures. So the first object in the queue will also be the first object out of the queue. We retrieve objects from our queue by using the poll method. This method both retrieves the first element from the Queue and removes it from the Queue.

```java
myQueue.poll()
```

***Iterating over a Queue***

In our final example we will be looking at using the while loop to iterate over our Queue and remove all of the elements. In the example below we are displaying all of the elements that were in the queue.



```java
while (!myQueue.isEmpty()) {
        System.out.println(myQueue.poll());
        }
```
