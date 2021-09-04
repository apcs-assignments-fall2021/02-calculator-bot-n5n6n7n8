# Calculator Bot Assignment

In this assignment, you'll be writing three methods to carry out some math operations. Using the Java Math methods will be very helpful.

The first method is median(). This method takes three integers as input, and returns the 2nd largest integer of the three integers. The method has the following signature: public static int median(int a, int b, int c) {}

The second method is magnitude(). This method takes two integers as input, and returns the integer with the larger absolute value. The method has the following signature: public static int magnitude(int a, int b) {}

The final method is pythagoras(). This method takes two integers as input. These two integers represent the numbers "a" and "b" in the Pythagoras theorem. The method returns the calculated value for "c". Remember that the Pythagoras theorem is "a^2 + b^2 = c^2". The method has the following signature: public static double pythagoras(int a, int b) {}

After writing the three methods and testing that they work, use Scanner in your main code to allow the user to choose which method to run. For instance, your program should allow them to type in the name of which method they want to run, then it will ask them for the necessary inputs and carry out the desired method. 

Note: you should use the .equals() method to check if two Strings are equal. == does not work for Strings! For example:
```shell script
String x = "hello";
String y = "hello";
boolean z = x.equals(y); // z = true
```

In addition, you may find the Scanner method scan.nextInt() helpful. Whereas scan.next() always returns a string, scan.nextInt() asks the user to type in an integer and returns an integer. This will probably save you some time with converting between types. 

Example of what your program may look like when it is being run:
```shell script
What command would you like to carry out?
median
What is the first number?
2
What is the second number?
3
What is the third number?
1
The median is 2
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to implement the above methods.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java). 

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use: 

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```