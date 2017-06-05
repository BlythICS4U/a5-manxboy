# a5 Assignment 5

A separate NetBeans project has been provided for each assignment question. Before you start your work, ensure that you have cloned this repository and created a develop branch. When you have completed the assignment, commit to your develop branch and create a pull request.

### Problem 1

A number of methods have been implemented in the accompanying NetBeans project.  In the javadoc comments above each method, state the runtime complexity of the method (using big-O notation).

### Problem 2

There is a divisibility rule in mathematics which states: an integer is divisible by 3 if the sum of its digits is divisible by 3.  For example,

* Is 126 divisible by 3?  Just add the digits 1 + 2 + 6 = 9.  Since 9 is divisible by 3, so is 126.

* Is 49867285022465 divisible by 3?  Sum of the digits is 69.
  * Is 69 divisible by 3?  Sum of the digits is 15.
    * Is 15 divisible by 3?  Sum of the digits is 6.
      * Is 6 divisible by 3?  Yes, since it’s just 1 digit, and it’s 3 or 6 or 9.

Implement this recursive algorithm and provide the necessary JUnit tests to ensure correctness.

### Problem 3

You have been provided with a Person class from an earlier exercise.  Within the Person class is an *id* field.  Update the Person class to implement the Comparable interface - using the *id* field to enforce the natural ordering.  After making this update, implement a version of Insertion sort which sorts an array of Person objects.  Write the necessary JUnit tests to ensure correctness.

### Problem 4

What follows is a description of a sorting algorithm.

Imagine you are picking flowers from a greenhouse.  You start with an empty cart and you pick flowers - one at a time.  You start by picking the best available flower and place it closest you in the cart.  Then, you pick the next best flower and place it in your cart, next to the first flower.  You repeat this process until you have picked all of the flowers you need.  You now have a cart of flowers, sorted from best to worst.

If we apply this algorithm more generally, you could sort an array of integers by repeatedly picking the maximum value and placing it at the end of the sorted section of the array.  Placing the max value in its sorted spot is accomplished by swapping it with the value at the end of the sorted section of the array.  It would look like this:

<img src="https://github.com/BlythICS4U/a5/blob/master/sortingAlgorithm.png" width="250" height="450"/>

Implement the described algorithm, adding sufficient JUnit tests to ensure correctness.  Also - in a javadoc comment above the method, document the following:
* State the runtime complexity of the algorithm in big-O notation
* Compare this algorithm to insertion sort
  * describe an array which would perform better using your algorithm (over insertion sort)
  * describe an array which would perform better using insertion sort (over your algorithm)
