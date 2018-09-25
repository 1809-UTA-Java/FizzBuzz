package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author Su Ean Lim
*/
class FizzBuzz {
	public static void main (String[] args) {
		
		int firstNum;
		int secondNum;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz\n");
			}
			if (i % 3 == 0) {
				System.out.println("Fizz\n");	
			}
			if (i % 5 == 0) {
				System.out.println("Buzz\n");	
			}
			else {
				System.out.print("%d\n", i);
			}
		}
		
		

	}
}