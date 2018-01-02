package com.java.essentials.module.one;
import java.util.Scanner;

public class ModuleOne {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		FirstProgram firstProgram_obj = new FirstProgram();
		firstProgram_obj.FirstProgramMain(args);
		
		DataTypesAndOperators dataTypesAndOperators_obj = new DataTypesAndOperators();
		dataTypesAndOperators_obj.dataTypesAndOperatorsMain();
		
		IfCondition ifConditionObj = new IfCondition(myScanner);
		ifConditionObj.ifConditionMain(ifConditionObj);
		
		WhileLoop whileLoopObj = new WhileLoop(myScanner);
		whileLoopObj.whileLoopMain(whileLoopObj);
		
		DoWhileLoop doWhileLoopObj = new DoWhileLoop(myScanner);
		doWhileLoopObj.doWhileLoopMain(doWhileLoopObj);
		
		ForLoop forLoopObj = new ForLoop(myScanner);
		forLoopObj.forLoopMain(forLoopObj);
	}
}