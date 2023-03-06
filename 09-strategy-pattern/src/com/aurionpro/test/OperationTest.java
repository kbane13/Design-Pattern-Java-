package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.OperationStrategy;

public class OperationTest {

	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		System.out.println("Adding operation:"+op.doOperation(10, 20));
		op.setOperation(new MultiplyOperation());
		System.out.println("Multiply operation:"+op.doOperation(20, 30));
		
	}

}
