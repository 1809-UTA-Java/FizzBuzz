package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This prograam will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author Denzel
*/

/ end goal is to have program print Fizz Buzz

class FizzBuzz {
	public static void main (String[] args){
		//TODO: FizzBuzz
	   int number = 100;
// loop through 100 time
	   for (int i=1; i<number; i++) {

// if 'number is divisible by 5, replace number w/'Buzz'
	   if (i%5== 0)
		System.out.print("Buzz"+" ");

// if 'number' is divisble by 3, replace number w/'Fizz'
	   else if(i%3== 0)
		System.out.print("Fizz"+" ");

//finally if number divisble by both 3 & 5, replace number w/"FizzBuzz'
	   else
		System.out.print(i+" ");

         }
    }
}