package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author David Helmick
*/
class FizzBuzz {
	public static void main (String[] args) {
<<<<<<< HEAD
		int number = 1;
		for (int i = 0; i!=100; i++){
			
			System.out.println(number);
			number++;
=======
		for (int i = 1; i <= 100; i++){
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
>>>>>>> 3d888edd8d578058c0c608cb32a2bf6de61aa099
		}
	}
}