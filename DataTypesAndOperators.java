package com.java.essentials.module.one;
public class DataTypesAndOperators {
	public void assignment_01() {
		System.out.println("_________________________________________________");
		System.out.println("Write programs to use all the data types and "
				+ "given arithmetic operations.\r");
		System.out.print("Operators\n + Addition\n- Subtraction"
				+ "\n * Multiplication\n / Division\n"
				+ " ++ Increment operator\n -- Decrement operator\n");
		// Integer Data Types
		System.out.println("****Integer Data Types****");
		
		byte myByte = 30;
		System.out.print("Working on 'byte' data type with value : " + myByte);
		System.out.println("Using operator + " + (myByte + myByte));
		System.out.println("Using operator - " + (myByte - myByte));
		System.out.println("Using operator * " + (myByte * myByte));
		System.out.println("Using operator / " + (myByte / myByte));
		System.out.println("Using operator ++ " + (myByte++));
		System.out.println("Using operator -- " + (myByte--));
		System.out.println("=================================================");
		
		long myLong = 199999900;
		System.out.print("Working on 'long' data type with value : " + myLong);
		System.out.println("Using operator + " + (myLong + myLong));
		System.out.println("Using operator - " + (myLong - myLong));
		System.out.println("Using operator * " + (myLong * myLong));
		System.out.println("Using operator / " + (myLong / myLong));
		System.out.println("Using operator ++ " + (myLong++));
		System.out.println("Using operator -- " + (myLong--));
		System.out.println("=================================================");
		
		short myShort = 1900;
		System.out.print("Working on 'short' data type with value : " + myShort);
		System.out.println("Using operator + " + (myShort + myShort));
		System.out.println("Using operator - " + (myShort - myShort));
		System.out.println("Using operator * " + (myShort * myShort));
		System.out.println("Using operator / " + (myShort / myShort));
		System.out.println("Using operator ++ " + (myShort++));
		System.out.println("Using operator -- " + (myShort--));
		System.out.println("=================================================");
		
		int myInt = 199999900;
		System.out.print("Working on 'int' data type with value : " + myInt);
		System.out.println("Using operator + " + (myInt + myInt));
		System.out.println("Using operator - " + (myInt - myInt));
		System.out.println("Using operator * " + (myInt * myInt));
		System.out.println("Using operator / " + (myInt / myInt));
		System.out.println("Using operator ++ " + (myInt++));
		System.out.println("Using operator -- " + (myInt--));
		System.out.println("=================================================");
		
		// Float Data Types
		System.out.print("\n****Float Data Types****\n");
		
		float myFloat = 999999999;
		System.out.print("Working on 'Float' data type with value : " + myFloat);
		System.out.println("Using operator + " + (myFloat + myFloat));
		System.out.println("Using operator - " + (myFloat - myFloat));
		System.out.println("Using operator * " + (myFloat * myFloat));
		System.out.println("Using operator / " + (myFloat / myFloat));
		System.out.println("Using operator ++ " + (myFloat++));
		System.out.println("Using operator -- " + (myFloat--));
		System.out.println("=================================================");
		
		double myDouble = 119191919.996746592726999999;
		System.out.print("Working on 'Double' data type with value : " + myDouble);
		System.out.println("Using operator + " + (myDouble + myDouble));
		System.out.println("Using operator - " + (myDouble - myDouble));
		System.out.println("Using operator * " + (myDouble * myDouble));
		System.out.println("Using operator / " + (myDouble / myDouble));
		System.out.println("Using operator ++ " + (myDouble++));
		System.out.println("Using operator -- " + (myDouble--));
		System.out.println("=================================================");
		
		// Character Data Types
		char myChar = 'a';
		System.out.print("\n****Character Data Type****\n");
		System.out.print(myChar + "\n");
		
		// Boolean Data Types
		boolean myBoolean = true;
		System.out.print("\n****Boolean Data Types****\n");
		System.out.print(myBoolean + "\n");
	}
	
	public void assignment_02() {
		int value_1 = 10, value_2 = 20;
		int result;
		System.out.println("_________________________________________________");
		System.out.println("Write program to perform all the arithmetic "
									+ "operations given in the table.");
		System.out.print("Operators\n + Addition\n- Subtraction"
				+ "\n * Multiplication\n / Division\n"
				+ " ++ Increment operator\n -- Decrement operator\n");
		System.out.println("_________________________________________________");
		System.out.println("((10-- + 20++) * (20-- - 10++)) / 20");
		result = ((value_1-- + value_2++) * (value_2-- - value_1++)) / value_2;
		System.out.print("Result is : " + result);
	}
	
	public void dataTypesAndOperatorsMain() {
		DataTypesAndOperators myDataTypesAndOperators 
								= new DataTypesAndOperators();
		myDataTypesAndOperators.assignment_01();
		myDataTypesAndOperators.assignment_02();
	}
}