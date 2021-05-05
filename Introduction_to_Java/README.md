#  What is Java?

Java is really popular and widely used—but what is it? Why was it developed and what sets it apart from some of the other languages that came before it?

## Java is an Object-Oriented Language

First, Java is an object-oriented programming language.

* In Object-Oriented Programming, we model the components of our software much as if they were real-world objects.

This allows us to interact with, and develop, our code in a more intuitive way, and it also makes it easier to maintain and re-use the components of our software.

## Java Uses Static Typing

Java uses something called static typing.

* In static typing, all variable have a data type that is defined when we first declare the variable, and this type cannot be changed later.

Static typing means the data type goes with the variable instead of the value that the variable holds. In contrast, dynamic typing is used by some other popular languages (like Python). 

## Java is Portable

Finally, a key characteristic of Java is that it is highly portable, meaning that Java can be used on many different devices, regardless of the device type (e.g., mobile or desktop) or operating system (e.g., Windows or Mac).

# Write Once, Run Anywhere (WORA)

Java was initially developed by James Gosling at Sun Microsystems, which was since acquired by Oracle. Before Java, languages like C and C++ dominated the industry. When Java was first implemented it had the motto Write Once, Run Anywhere (WORA). We can get some insight into what that means by comparing Java with C++.

Suppose we want to write a program that will run on multiple operating systems, such as Windows, Linux, and MacOS. To do this, we have to take the C++ source code that we wrote the program in, and run it through a compiler.

***To compile software means to transform the source code that we use to write the program into a machine language that a computer can understand and execute.***

As shown in the diagram below (on the left), C++ code has to be compiled separately for each operating system, requiring us to create compilers for Windows, Linux, and Mac. This is a lot of extra work.

![](./fig/cplusplusvsjava)

In contrast, the Java compiler compiles the software for the Java virtual machine (or JVM). The JVM is installed on the users computer and can be downloaded for free—in fact, most computers sold today already come with Java installed. This means we can compile the code once and then run it on every operating system. How does Java do this? Well, instead of compiling code directly into machine code, like C++, Java compiles the source code first into bytecode. Bytecode is a special language that the JVM can read and transform into machine language. This allows Java to run any Java program on any machine that has a JVM installed on it, regardless of the OS.


 
