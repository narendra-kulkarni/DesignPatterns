package com.mission.designPatterns.nullObject;

import com.mission.designPatterns.nullObject.impl.Factory;

public class Client {

	public static void main(String[] args) {
		// Client just gets the object. It does not care whether the object is the real one
		// or the null object. This type of coding removes null checks from client code.
		IOperation op = Factory.getOperation(2);
		op.perform();
		
		op = Factory.getOperation(7);
		op.perform();
	}
}
