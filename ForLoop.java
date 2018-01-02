package com.java.essentials.module.one;
import java.util.Scanner;

public class ForLoop {
	
	Scanner scannerFor;
	ForLoop(Scanner scannerObj){
		scannerFor = scannerObj;
	}
	
	public void assignment_01() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to print 10 even numbers "
				+ "and 10 odd numbers.");
		for(int number = 1; number <= 20; number++) {
			if(number % 2 == 0) {
				System.out.printf("Even Number is : %d.\n",number);
			} else {
				System.out.printf("Out Number is : %d.\n",number);
			}
		}
	}
	
	public void assignment_02() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to find factorial of a number.");
		System.out.print("Enter the number : ");
		int result = 1;
		for(int number = scannerFor.nextInt(); number > 0; number--) {
			result = result * number;
		}
		System.out.printf("Factorial is %d\n", result);
	}
	
	public void assignment_03() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to generate tables of 10.");
		System.out.print("Enter the number : ");
		int number = scannerFor.nextInt();
		for(int i=1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + i * number);
		}
	}
	
	public void assignment_04() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to add the digits of a number.");
		System.out.print("Enter the number : ");
		int result = 0, digit;
		
		for(int number = scannerFor.nextInt(); number > 0; number = number / 10) {
			digit = number % 10;
			result = result + digit;
		}
		System.out.printf("Sum of the digits is %d\n", result);
	}
	
	public void assignment_05() {
		System.out.println("_______________________________________"
				+ "___________________________________________________\n");
		System.out.println("Write a program to reverse the "
				+ "digits of a number.");
		int result = 0, digit;
		for(int number = scannerFor.nextInt(); number > 0; number = number / 10) {
			digit = number % 10;
			result = (result + digit) * 10;
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
		for(int counter = 2; counter < 10; counter++) {
			System.out.print(val1 + " ");
			val3 = val1;
			val1 = val2 + val1;
			val2 = val3;
		}
	}
	
	public void forLoopMain(ForLoop forLoopObj) {
		forLoopObj.assignment_01();
		forLoopObj.assignment_02();
		forLoopObj.assignment_03();
		forLoopObj.assignment_04();
		forLoopObj.assignment_05();
		forLoopObj.assignment_06();
	}
}
