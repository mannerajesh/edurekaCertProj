package com.java.essentials.module.two;
import java.util.Scanner;

public class Functions {

	Scanner myScanner;
	Functions(Scanner myScannerObj) {
		myScanner = myScannerObj;
	}
	public void functions_01() {
		System.out.println("Write a program to find "
				+ "the cube of a number");
		int number = myScanner.nextInt();
		System.out.printf("The Cube of the number is %d\n", (number*number*number));
		System.out.println("_________________________________"
				+ "________________");
	}
	
	public void functions_02() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to find factorial of a number.");
		System.out.print("Enter the number : ");
		int result = 1;
		for(int number = myScanner.nextInt(); number > 0; number--) {
			result = result * number;
		}
		System.out.printf("Factorial is %d\n", result);
	}
	
	public void functions_03() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to reverse the "
				+ "digits of a number.");
		int result = 0, digit;
		for(int number = myScanner.nextInt(); number > 0; 
								number = number / 10) {
			digit = number % 10;
			result = (result + digit) * 10;
		}
		result = result / 10;
		System.out.printf("Reverse of the digits is %d\n", result);
	}
	
	public void functions_04() {
		System.out.println("Write a program to check the "
				+ "given string is Palindrome of not");
		String myString = myScanner.next();		
		StringBuilder myStringBuilder = new StringBuilder(myString);
		StringBuilder myStringBuilder1 = new StringBuilder(myString);
		myStringBuilder1.reverse();
		
		if(myStringBuilder.toString().matches(myStringBuilder1.toString()) == true) {
			System.out.printf("Provided string %s is Palindrome (%s)\n",
					myStringBuilder.toString(),myStringBuilder1.toString());
		} else {
			System.out.printf("Provided string %s is not Palindrome (%s)\n",
					myStringBuilder.toString(),myStringBuilder1.toString());
		}
		
		System.out.println("_________________________________"
				+ "________________");
	}
	
	public void functions_05() {
		System.out.println("Write a program to check given "
				+ "number is even or odd");
		int number = myScanner.nextInt();
		if (number % 2 == 0) {
			System.out.printf("Number %d is even\n",number);
		} else {
			System.out.printf("Number %d is odd\n",number);
		}
		
		System.out.println("_________________________________"
				+ "________________");
	}
	
	public void functions_06() {
		System.out.println("Write a program to generate \"\r\n" + 
				"				+ \"'n' Febonacci numbers");
		System.out.print("Enter the count for the Febonacci series:");
		int val1 = 1, val2 = 1, val3;
		int count = myScanner.nextInt();
		System.out.print(val1 + " ");
		for(int counter = 1; counter < count ;counter++) {
			System.out.print(val1 + " ");
			val3 = val1;
			val1 = val2 + val1;
			val2 = val3;
		}
		System.out.println("\n_________________________________"
				+ "________________");
	}
	
	public void functions_07() {
		System.out.println("Write a program to check the "
				+ "given number is prime or not");
		int number = myScanner.nextInt(), temp = number, isPrime = 1;
		while(temp > 2) {
			temp--;
			if(number % temp == 0) {
				isPrime = 0;
				System.out.printf("%d is divisible by %d\n",number,temp);
				break;
			} 
		}
		if(isPrime == 1) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		System.out.println("_________________________________"
				+ "________________");
	}
	
	public void functions_08() {
		System.out.println("Write a program to swap two numbers");
		System.out.print("Enter two numbers:");
		int value1 = myScanner.nextInt(), value2 = myScanner.nextInt(),
												value3 = 0;
		System.out.printf("value1 = %d, value2 = %d\n",value1,value2);
		value3 = value1; value1 = value2; value2 = value3;
		System.out.printf("value1 = %d, value2 = %d\n",value1,value2);
		value2 = (value1 + value2) - ( value1 = value2);
		System.out.printf("value1 = %d, value2 = %d\n",value1,value2);
		System.out.println("_________________________________"
				+ "________________");
	}
	
	public void functionsMain(Functions myFunctions) {
		myFunctions.functions_01();
		myFunctions.functions_02();
		myFunctions.functions_03();
		myFunctions.functions_04();	
		myFunctions.functions_05();
		myFunctions.functions_06();
		myFunctions.functions_07();
		myFunctions.functions_08();
	}
}

