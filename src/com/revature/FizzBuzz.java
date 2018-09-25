package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author YourNameHere
*/
class FizzBuzz {
	public static void main (String[] args) {
		//TODO: FizzBuzz
		if (args.length != 1) {
			System.out.println("USAGE: java FizzBuzz [Number to go to inclusive]");
			return;
		}

		for (int i = 0; i <= Integer.parseInt(args[0]); ++i) {
			if (i % 3 == 0) {
				System.out.printf("Fizz");
			}
			if (i % 5 == 0) {
				System.out.printf("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.printf("%d", i);
			}

			System.out.printf("\n");
		}
	}
}
