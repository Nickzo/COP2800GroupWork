package com.GoupB;

/**
 * Created by abirfaisal on 2/3/15.
 */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;
import java.util.Scanner;


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
    // somone comment this too lazy
    public static char passwordMenu[]{
     public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the password: ");
		 String password = input.nextLine();
		 System.out.println(IsValid(password));
		 }//end of main
		 public static String IsValid(String pass) {
		 int digitCount = 0;
		 if (pass.length() >= 8) {//checks is password length is less than or equal to 8
		 for (char c : pass.toUpperCase().toCharArray()) {//to char array converts string to array
		 if ((int) c >= 48 && (int) c <= 57)//ascii decimal value for numbers
		 {
		 // This is a digit
		 digitCount++;
		 } else if ((int) c >= 65 && (int) c <= 90)//ascii decimal values for capital letters
		 {
		 // This is an alphabetical character
		 } else {
		 // Other character that are not numbers or letters
		 return "Invalid: password must consist of only letters and digits";
		 }
		 }//end of for
		 if (digitCount < 2)//if there are less than 2 digits
		 {
		 return "Invalid: password must contain at least 2 digits";
		 }
		 }//end of outer if
		 else {
		 return "Invalid: password must have at least 8 characters";
		 }//end of outer else
		 return "Valid";
		 }
    }
    
    
//Not sure if this is where you want it
    import java.util.Scanner;
    public static void phoneKeypadMenu(){
        public static void main(String[] args) {
		
	System.out.print("Enter a string: ");
	Scanner input = new Scanner(System.in);
	String Number = input.next();
	String output = "";
	
	for(int i = 0 ; i < Number.length() ; i++){
	char ch = Character.toUpperCase(Number.charAt(i));//converts lowercase to uppercase and returns char value
		if(Character.isLetter(ch)){//determines if character is a letter
			int digit = getNumber(ch);//if it is a letter it runs the getNumber method
			output = output + digit;}//end of if //character is converted and digit gets output
		else{
			 output = output + ch;}//end of else
			        }//end of for
			         
	System.out.println(output);
	
	input.close();
			    }//end of main
	
public static int getNumber(char upperCaseLetter){
    int number = 0;
	switch (upperCaseLetter) {
	case 'A':
	case 'B':
	case 'C':
	number = 2;
	break;
	case 'D':
	case 'E':
	case 'F':
	number = 3;
	break;
	case 'G':
	case 'H':
	case 'I':
	number = 4;
	break;
	case 'J':
	case 'K':
	case 'L':
	number = 5;
	break;
	case 'M':
	case 'N':
	case 'O':
	number = 6;
	break;
	case 'P':
	case 'Q':
	case 'R':
	case 'S':
	number = 7;
	break;
	case 'T':
	case 'U':
	case 'V':
	number = 8;
	break;
	case 'W':
	case 'X':
	case 'Y':
	case 'Z':
	number = 9;
	break;
	}
	return number;
	}//end of getNumber

    }//end of phonekeypads

    public static void EMIRPMenu(){
    	 public static void main (String[] args)  
     {  
		 //the program will find the emirp up to 100
          int[] p = new int[100];  
          int count =0;  
                   for (int i =2;count<100;i++)  
             {  
               if (isEmirp(i))  
               {  
                    p[count] = i;  
                    count++;  
               }   
          }
          for(int i =0;i<100;i++)  
          {  
               if ((i+1) % 10 == 0) 
                    System.out.println(p[i]);  
               else 
                    System.out.print(p[i] + "\t");  
          }
     }//end main    
	 public static int reverse (int num)  
      {  
          String s0 = Integer.toString(num);  
          String s1 = "";  
          {  
               for(int i =s0.length()-1;i>=0;i--)  
               {  
                    s1+= s0.charAt(i);  
               }  
          }  
          return Integer.parseInt(s1);  
     }// end reverse
     public static int reverse1(int num)  
     {  
          String str = Integer.toString(num);
          String s1 = "";  
          
        
          for(int i =str.length()-1;i>=0;i--)  
          {  
              s1+= str.charAt(i);  
          }  
          
          return Integer.parseInt(s1);  
	}  //end reverse1
     public static boolean PalPrime(int num)  
	{  
    	 //The functions will choose whether the primes 
    	 //meet the requirements of the function
          String s2 = Integer.toString(num);  
          if (isPrime(num))  
          {  
            
               if(s2.equalsIgnoreCase(""+reverse1(num)))
                   return true;
          }  
          else
               return false;
		return false;  
     }// end PalPrime
     public static boolean isEmirp(int num)  
     {  
          String s2 = Integer.toString(num);
 
          if (isPrime(num) && isPrime(reverse(num)) && (PalPrime(num) == false))  
               return true;  
          else  
               return false;  
     }  //end isEmirp
     public static boolean isPrime(int num)  
	 {  
          
          for(int i =2;i<=Math.sqrt(num);i++)   
          {  
               if(num%i==0)   
               {  
                    return false;  
               }  
          }  
          return true;  
     }  //end isPrime
}//end class

    }

    public static void twinPrimesMenu(){
public class TwinPrimes {

	public static void main(String[] args) {
		printPrimeNumbers(35);	
	}
	public static void printPrimeNumbers(int numberOfPrimes) {
		//the constant and initializations are find for the functions
		final int NUMBER_OF_PRIMES_PER_LINE = 2;
		int count = 0;
		int number = 3;
		int countOne = 0;
		int numberOne = 5;
		
		while (count < numberOfPrimes && countOne < numberOfPrimes){
			//the program will display the primes in , for example, (#,#).
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
	// Evaluates for each prime number so that the prime number will be displayed
	//to the user correctly
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
	}//end main
}//end class
	
}


    }
}
