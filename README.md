# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  This exception occurs when you try to access an array element using an index that's either negative or greater than or equal to the array's length.

The `Bug.java` file contains code that reproduces the error.  The `BugSolution.java` file shows how to fix it.

## How to Reproduce

1. Clone this repository.
2. Compile `Bug.java` using a Java compiler (like the one included in the JDK).
3. Run the compiled code. You'll see the `ArrayIndexOutOfBoundsException`.

## Solution

The solution involves carefully checking array indices before accessing array elements to ensure that they are within the valid range [0, array.length -1].