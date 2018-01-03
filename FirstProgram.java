package com.java.essentials.module.one;
public class FirstProgram {

	public void helloWorld()
	{
		System.out.println("_________________________________________________");
		System.out.println("Hello World from edureka\n");
		int a = 10, b = 20, c = 0;
		c = a + b;
		System.out.println("Result is : " + c);	
	}
	public void FirstProgramMain(String[] args) {
		FirstProgram myfirstProgram = new FirstProgram();
		myfirstProgram.helloWorld();
	}
}
