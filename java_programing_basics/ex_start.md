# Exercise: Getting Started

## Printing Output

For this first exercise, our goal is simply to create a short program (or script) that prints out a message. To print output in Java, we can use System.out.println. For example:

*System.out.println("Hello world!!");*

This takes whatever message we place in the parentheses and prints that message. In this case, it will print `"Hello world!" in the CLI.

## Compiling and Running the Code

When you want to test your program, you cannot simply run it—you must first *compile* the code. You can do this by using the *javac* command, followed by the name of the file you want to compile. In the below example, our file is called GettingStarted.java. So in this case, we will compile the code by running:

*javac GettingStarted.java*

Once the code is compiled, we can run it. To do this, we simply enter java followed by the name of the file. In this exercise it will be:

*java GettingStarted.java*

The main method is the entry point for the program. When we say it is the"entry point", we mean that everything will start running from here. So for this exercise, we will want to add all our code inside the main method (between the opening and closing braces { }).

One last thing to notice about the above code is the indentation. You'll notice that some of the code is indented by four spaces. This indentation is used to help show which blocks of code are nested inside of other blocks. The standard practice in Java is typically to indent code by four spaces.

## Code Comments

In Java, you can add two slashes // to create a single-line code comment. All of the text to the right of the // is treated as a comment and ignored (i.e., it does not get treated as code and Java will not try to run it when the program executes).

You can also create multi-line code comments by using /* and */.
