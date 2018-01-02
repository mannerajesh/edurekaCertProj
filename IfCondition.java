package com.java.essentials.module.one;
import java.util.Scanner;

public class IfCondition {
	
	Scanner scannerIfCondition;	
	IfCondition(Scanner scannerObj){
		scannerIfCondition = scannerObj;
	}
	public void assignment_01() {
		System.out.println("_________________________________________________");
		System.out.println("Write a program to check if a candidate is "
				+ "eligible for voting or not. (Hint: Check age)");
		System.out.print("Enter vote age for validation:");
		int voterAge = scannerIfCondition.nextInt();
		if (voterAge < 18) {
			System.out.println("Voter cannot vote");
		} else {
			System.out.println("Voter can vote");
		}
	}
	public void assignment_02() {
		System.out.println("_______________________________________"
				+ "___________________________________________________");
		System.out.println("Write a program to check if the "
				+ "number is positive or negative.");
		System.out.print("Enter number for validation:");
		int integer = scannerIfCondition.nextInt();
		if (integer < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is positive");
		}
	}
	public void assignment_03() {
		System.out.println("_______________________________________"
				+ "___________________________________________________");
		System.out.println("Extend the previous program to check "
				+ "whether the given number is positive, zero or negative."
				+ "(Hint: use if-else conditions)");
		System.out.print("Enter number for validation:");
		int integer = scannerIfCondition.nextInt();
		if (integer < 0) {
			System.out.printf("Number %d is negative\n",integer);
		} else {
			if (integer == 0) {
				System.out.printf("Number %d is zero\n",integer);
			} else {
				System.out.printf("Number %d is positive\n",integer);
			}
		}
	}
	public void assignment_04() {
		System.out.println("_______________________________________"
				+ "___________________________________________________");
		System.out.println("Write a program to find largest of two numbers.");
		System.out.print("Enter numbers for validation:");
		int integer_1= scannerIfCondition.nextInt();
		int integer_2 = scannerIfCondition.nextInt();
		if (integer_1 < integer_2) {
			System.out.printf("Number %d is greater out of %d "
					+ "and %d\n",integer_2,integer_1,integer_2);
		}
		if (integer_1 > integer_2){
			System.out.printf("Number %d is greater out of %d "
					+ "and %d\n",integer_1,integer_2,integer_1);
		}
		if (integer_1 == integer_2){
			System.out.printf("Number %d and %d are equal",integer_1,integer_2);
		}
	}
	public void assignment_05() {
		System.out.println("_______________________________________"
				+ "___________________________________________________");
		System.out.println("Write a program to check given number is "
				+ "even or odd. (Hint: use % operator)");
		System.out.print("Enter number for validation:");
		int integer = scannerIfCondition.nextInt();
		if (integer % 2 == 0) {
			System.out.printf("Number %d is even\n",integer);
		} else {
			System.out.printf("Number %d is odd\n",integer);
		}
	}
	
	public void ifConditionMain(IfCondition ifConditionObj) {
		ifConditionObj.assignment_01();
		ifConditionObj.assignment_02();
		ifConditionObj.assignment_03();
		ifConditionObj.assignment_04();
		ifConditionObj.assignment_05();
	}
}