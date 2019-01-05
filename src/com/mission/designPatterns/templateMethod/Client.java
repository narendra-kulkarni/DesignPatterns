package com.mission.designPatterns.templateMethod;

import com.mission.designPatterns.templateMethod.impl.Coffee;
import com.mission.designPatterns.templateMethod.impl.Tea;

public class Client {

	// Template method pattern is used to create code hooks. In this template method creates an algorithm
	// and allows the subclasses to implement part of the algorithm.
	public static void main(String[] args) {
		System.out.println("Tea***\n");
		Beverage b = new Tea();
		b.prepareBeverage();
		
		System.out.println("\n\nCofee***\n");
		b = new Coffee();
		b.prepareBeverage();
	}
}
