package com.revature;
//Javadoc style comment
/**
* This is a basic FizzBuzz attempt.
* This program will run FizzBuzz. You can run this following the directions in the README.
* @author Zach Leonard
*/
class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
	    if (i % 3 == 0) {
                System.out.print( "Fizz\n" );
            }
            else if (i % 5 == 0) {
                System.out.print( "Buzz\n" );
            }
            else if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.print( "Buzz\n" );
            }
            else {
                System.out.print( i + "\n");
	    }
        }
    }
}