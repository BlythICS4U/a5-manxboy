# a5 Assignment 5

A separate NetBeans project has been provided for each assignment question. Before you start your work, ensure that you have cloned this repository and created a develop branch. When you have completed the assignment, commit to your develop branch and create a pull request.

### Problem 1

### Problem 2

There is a divisibility rule in mathematics which states: an integer is divisible by 3 if the sum of its digits is divisible by 3.  For example,

* Is 126 divisible by 3?  Just add the digits 1 + 2 + 6 = 9.  Since 9 is divisible by 3, so is 126.

* Is 49867285022465 divisible by 3?  Sum of the digits is 69.
  * Is 69 divisible by 3?  Sum of the digits is 15.
    * Is 15 divisible by 3?  Sum of the digits is 6.
      * Is 6 divisible by 3?  Yes, since it’s just 1 digit, and it’s 3 or 6 or 9.

Implement this recursive algorithm and provide the necessary JUnit tests to ensure correctness.

### Problem 3

You have been provided with a Person class from an earlier exercise.  Within the Person class is an *id* field.  Update the Person class to implement the Comparable interface - using the *id* field to enforce the natural ordering.  After making this update, implement a version of Selection sort which sorts an array of Person objects.  Write the necessary JUnit tests to ensure correctness.

### Problem 4

What follows is a description of a sorting algorithm.  Implement the described algorithm, adding sufficient JUnit tests to ensure correctness.  Also - state the runtime complexity of the algorithm in big-O notation (you can include it as part of javadoc comments above the method signature).

Algorithm description:

Imagine you have a shuffled deck of cards (a single suit only), face down on a table.  You pick up cards, one at a time, and place them in your hand.  When you place the card in your hand, you place it in the sorted position.  For example,
* You pick up the 5H first, and up it in you hand
* Next, you pick up the 10H, and put it in your hand, to the right of the 5H
* Next, you pick up the 7H, and put it in your hand, in between the 5H and 10H
* etc. - until the entire deck is in your hand - sorted

If we apply this algorithm more generally - sorting an array of integers would look something like this:

