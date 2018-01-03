package com.java.essentials.module.two;
import java.util.Scanner;
public class DataHandNFuncs {
	
	Scanner myScanner;
	static int empIDs[];
	static String empNames[];
	static int empSalaries[];
	
	DataHandNFuncs(Scanner myScannerObj) {
		myScanner = myScannerObj; 
	}
	
	public void createEmpDatabase() {
		System.out.print("Enter Employee Count:");
		int empCount = myScanner.nextInt();
		empIDs = new int[empCount];
		empNames = new String[empCount];
		empSalaries = new int[empCount];
		
		for(int i=0; i <= empCount-1;i++) {
			System.out.print("Enter Employee ID:");
			empIDs[i] = myScanner.nextInt();
			System.out.print("Enter Employee Name:");
			empNames[i] = myScanner.next();
			System.out.print("Enter Employee Salary:");
			empSalaries[i] = myScanner.nextInt();
		}
	}
	
	public void display(int[] empIDList, String[] empNames, int[] empSalaries ) {
		System.out.println("================================================");
		System.out.println("EMPLOYEE ID\tEMPLOYEE NAME\tEMPLOYEE SALARY");
		System.out.println("================================================");
		int empCount = empIDList.length;
		for(int i =0; i< empCount;i++) {
			System.out.printf("%d\t\t%s\t\t%d\n",empIDList[i],empNames[i],empSalaries[i]);
		}
		System.out.println("================================================");
	}
	
	public void display(int[] empIDList, String[] empNames) {
		System.out.println("================================================");
		System.out.println("EMPLOYEE ID\tEMPLOYEE NAME");
		System.out.println("================================================");
		int empCount = empIDList.length;
		for(int i =0; i< empCount;i++) {
			System.out.printf("%d\t\t%s\n",empIDList[i],empNames[i]);
		}
		System.out.println("================================================");
	}
	
	public void display(int empID, int[] empIDList, String[] empNames, int[] empSalaries) {
		System.out.println("================================================");
		System.out.println("EMPLOYEE ID\tEMPLOYEE NAME\tEMPLOYEE SALARY");
		System.out.println("================================================");
		int empCount = empIDList.length;
		for(int i =0; i< empCount;i++) {
			if(empID == empIDList[i]) {
				System.out.printf("%d\t\t%s\t\t%d\n",empIDList[i],empNames[i],empSalaries[i]);
			}
		}
		System.out.println("================================================");
	}
	
	public void assignment_01() {
		System.out.println("1. Write a program to accept 5 employee IDs and "
				+ "the corresponding names and their salaries from the user \n"
				+ "and store them in three arrays. Pass these arrays to a "
				+ "function display() as arguments. This display() will \n"
				+ "display the content of the arrays in the following "
				+ "format.\n================================\n"
				+ "ID\tName\tSalary\n"
				+ "================================\n"
				+ "00\tJohn\t600000\n"
				+ "002\tClark\t550000\n"
				+ "003\tNancy\t500000\n"
				+ "004\tJoe\t500000\n"
				+ "005\tMary\t300000\n"
				+ "========================================\n\n");
		display(empIDs, empNames, empSalaries);
	}
	
	public void assignment_02() {
		System.out.println("2. Write another function display() with Employee\n"
				+ " ID array and Employee name array as arguments. (Note: here\n"
				+ " we are using concept of function overloading). This\n"
				+ " function will display the content of the 2 arrays in\n"
				+ " the following format.\n================================\n"
				+ "ID\tName\n"
				+ "================================\n"
				+ "00\tJohn\n"
				+ "002\tClark\n"
				+ "003\tNancy\n"
				+ "004\tJoe\n"
				+ "005\tMary\n"
				+ "========================================\n\n");
		display(empIDs, empNames);
	}

	public void assignment_03() {
		System.out.println("3. Write another function named display() which \n"
				+ "takes 4 arguments. The arguments are named as String and \n"
				+ "3 arrays (Employee id, name and salary). Function prototype\n"
				+ " looks like:\r\n" + 
				"display (String name, int regno[], String Empname[], "
				+ "double salary[]).\r\n" + 
				"This function will search for the name in the Empname array\n"
				+ " and will display its corresponding id and salary in the \n"
				+ "below given format. For example, if Divya is given as the \n"
				+ "name to search then display () function will display the \n"
				+ "following record.\n================================\n"
				+ "ID\tName\tSalary\n"
				+ "================================\n"
				+ "00\tJohn\n"
				+ "========================================\n\n");
		System.out.print("Enter Employee to be searched for:");
		int empID = myScanner.nextInt();
		display(empID, empIDs, empNames, empSalaries);
	}
	
	public void dataHandNFuncsMain(DataHandNFuncs myDataHandNFuncs) {
		myDataHandNFuncs.createEmpDatabase();
		myDataHandNFuncs.assignment_01();
		myDataHandNFuncs.assignment_02();
		myDataHandNFuncs.assignment_03();
	}
}

