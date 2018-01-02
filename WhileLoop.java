package com.java.essentials.module.one;
import java.util.Scanner;

public class WhileLoop {
	
	Scanner scannerWhile;
	WhileLoop(Scanner scannerObj){
		scannerWhile = scannerObj;
	}
	
	public void assignment_01() {
		int evenCount=0, oddCount = 0;
		int number = 1;
		System.out.println("_________________________________________________");
		System.out.println("Write a program to print 10 even numbers and 10 odd numbers.");
		while ((evenCount <= 10) && (oddCount <= 10)) {
			if (number % 2 == 0) {
				System.out.println("Even Number is " + number);
				evenCount++;
			} else {
				System.out.println("Odd Number is " + number);
				oddCount++;
			}
			number++;
		}
	}
	
	public void assignment_02() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to find factorial of a number.");
		int number = scannerWhile.nextInt(), res = 1;
		while(number != 0) {
			res = number * res;
			number--;
		}
		System.out.printf("Factorial of the number is %d\n",res);
	}
	
	public void assignment_03() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to generate tables of 10.");
		int number = scannerWhile.nextInt(), res = 1;
		while( res <= 10) {
			System.out.println(number + " * " + res + " = " + res * number);
			res++;
		}
	}
	
	public void assignment_04() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to add the digits of a number.");
		System.out.print("Enter the number : ");
		int result = 0, digit;
		int number = scannerWhile.nextInt();
		while( number > 0) { 
			digit = number % 10;
			result = result + digit;
			number = number / 10;
		}
		System.out.printf("Sum of the digits is %d\n", result);
	}
	
	public void assignment_05() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to reverse the "
				+ "digits of a number.");
		int result = 0, digit;
		int number = scannerWhile.nextInt();
		while(number > 0) {
			digit = number % 10;
			result = (result + digit) * 10;
			number = number / 10;
		}
		result = result / 10;
		System.out.printf("Reverse of the digits is %d\n", result);
	}
	
	public void assignment_06() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to generate 10 Fibonacci numbers.");
		int val1 = 1, val2 = 1, val3;
		System.out.print(val1 + " ");
		int counter = 2;
		while(counter < 10) {
			System.out.print(val1 + " ");
			val3 = val1;
			val1 = val2 + val1;
			val2 = val3;
			counter++;
		}
	}
	
	public void whileLoopMain(WhileLoop whileLoopObj) {
		whileLoopObj.assignment_01();
		whileLoopObj.assignment_02();
		whileLoopObj.assignment_03();
		whileLoopObj.assignment_04();
		whileLoopObj.assignment_05();
		whileLoopObj.assignment_06();
	}
}
