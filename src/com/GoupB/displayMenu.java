package com.GoupB;

/**
 * Created by abirfaisal on 2/3/15.
 */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;

public class displayMenu {

    //returns value from 1-4 to signify a seleciton
    public static int mainMenu() {
        //Displays  main menu
        System.out.print("6.18 Check Password \n");
        System.out.print("6.21 Phone Keypad \n");
        System.out.print("6.27 EMIRP \n");
        System.out.print("6.29 Twin Primes \n");
        //get input
        Scanner b = new Scanner(System.in);
        int c = b.nextInt();

        //Check input
        if (c < 1 | c > 4) {
            System.out.print("Invalid Input \n");
            displayMenu.mainMenu();
        }
        return c;
    }
    // Asks the user to input their password
    public static char passwordMenu[]{
        System.out.print("Please enter your password");
        Scanner a = new Scanner(System.in);
        char b = a.next();
        return b;
    }

    public static void phoneKeypadMenu(){

    }

    public static void EMIRPMenu(){

    }

    public static void twinPrimesMenu(){

	    public static void main(String[] args) {
		printPrimeNumbers(35);
		
	}
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 2;
		int count = 0;
		int number = 3;
		int countOne = 0;
		int numberOne = 5;
		
		while (count < numberOfPrimes && countOne < numberOfPrimes){
			
			if ( isPrime(number) && isPrime(numberOne)){
				count++;
				countOne++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0 && count % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.printf("(" + number + "," + numberOne + ")\n");
				}
				else
					System.out.printf("(" + number + "," + numberOne + ")\n");
			}
			number++;
			numberOne++;
		}
	}
	public static boolean isPrime(int number) {
		for ( int divisor = 2; divisor <=number / 2; divisor++){
			if (number % divisor == 0){	
		return false;
			}
		}
		return true;
	}
	public static boolean isPrime1(int numberOne) {
		for ( int divisorOne = 2; divisorOne <=numberOne / 2; divisorOne++){
			if (numberOne % divisorOne == 0){	
		return false;
			}
		}
		return true;
	    }
    }
}
}
