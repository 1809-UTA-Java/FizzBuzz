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

		int iCap = 100;
		String sOut = "1";

		//if(args[0] != null)
		//	iCap = Integer.parseInt(args[0]);

		for(int iCntr = 1; iCntr <= iCap; iCntr++) {
			if(iCntr % 3 == 0)
				sOut += "Fizz";

			if(iCntr % 5 == 0)
				sOut += "Buzz";

			if(sOut == "\0")
				sOut = Integer.toString(iCntr);

			System.out.print(sOut +", ");

			sOut = "\0";
		}

		System.out.print("\n");
	}
}
