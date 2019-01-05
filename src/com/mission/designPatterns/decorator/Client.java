package com.mission.designPatterns.decorator;

import com.mission.designPatterns.decorator.impl.Coffee;
import com.mission.designPatterns.decorator.impl.Lemon;
import com.mission.designPatterns.decorator.impl.Mocha;
import com.mission.designPatterns.decorator.impl.Tea;

public class Client {

	public static void main(String[] args) {
		Beverage b = new Lemon(new Tea());
		print(b);
		
		Beverage b1 = new Mocha(new Coffee());
		print(b1);
	}

	private static void print(Beverage b) {
		System.out.println(b.getDescription());
		System.out.println(b.getCost());		
	}

}
