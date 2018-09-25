package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author Leonardo De Leon
*/
class FizzBuzz {
	public static void fizzBuzz(int numTotal) {
		
		for (int i = 1; i < numTotal; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz,");
				
			} else if (i % 5 == 0) {
				System.out.print("Buzz,");
			} else {
				System.out.print(i+",");
			}
		}
	}
	public static void main (String[] args) {
		//TODO: FizzBuzz
		System.out.println("Here is a fun way to count using Fizz Buzz: ");
		fizzBuzz(100);
	}
}