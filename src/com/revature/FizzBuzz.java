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
		String fizzBuzz="";
		for(int i = 1; i < 16 ; i++){
			if(i %5==0){
				fizzBuzz = "Buzz";
			}
			if(i%3 ==0){
				fizzBuzz = "Fizz";
			}
			if(i %3 ==0 && i%5 ==0){
				fizzBuzz = "FizzBuzz";
			}
			if(fizzBuzz==""){
				System.out.println(i);
			}else{
				System.out.println(fizzBuzz);
			}
			fizzBuzz = "";
		}
	}
}