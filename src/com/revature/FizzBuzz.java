package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author Steven Sly
*/
class FizzBuzz {
	public static void main (String[] args) {
		FizzBuzz(3, 5, 0, 100);
	}
	
	/**
	* This method takes integer paramters for the fizzNumber, the buzzNumber, the lowerBound, and the upperBound and 
	* outputs the FizzBuzz between the lower and upper bound.
	*/
	public static void FizzBuzz(int fizzNumber, int buzzNumber, int lowerBound, int upperBound) {
		// Loop to print out fizz buzz given method parameters
		for (int i  = lowerBound; i < upperBound; i++) {
			
			// work around the case where i == 0 for modulus operation.
			if (i != 0) {
				// FizzBuzz
				if ( (i % fizzNumber == 0) && (i % buzzNumber == 0) ) {
					System.out.println("FizzBuzz");
				// Fizz
				} else if (i % fizzNumber == 0) {
					System.out.println("Fizz");
				// Buzz
				} else if (i % buzzNumber == 0) {
					System.out.println("Buzz");
				// #
				} else {
					System.out.println(i);
				}
			// 0	
			} else if (i == 0){
				System.out.println(0);
			}
		} 
	}
}