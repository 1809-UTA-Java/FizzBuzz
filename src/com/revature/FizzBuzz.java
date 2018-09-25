package com.revature;

/**
* This is a basic FizzBuzz attempt
*
* This program will run FizzBuzz. You can run this following the
* directions in the README.
*
* @author Daria Davaloo
*/
class FizzBuzz {
	public static void main (String[] args) {
		for( int i = 0; i < args.length; i++ ) {
			if( args[i] % 3 == 0 && args[i] % 5 == 0 ) {
				System.out.println( "FizzBuzz" );			
			}
			else if( args[i] % 3 == 0 ) {
				System.out.println( "Fizz" );			
			}
			else if( args[i] % 5 == 0 ) {
				System.out.println( "Buzz" );			
			}
			else{
				System.out.println( args[i] );			
			}

		}
	}
}