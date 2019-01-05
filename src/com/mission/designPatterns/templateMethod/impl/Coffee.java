package com.mission.designPatterns.templateMethod.impl;

import com.mission.designPatterns.templateMethod.Beverage;

public class Coffee extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Brewing coffee.");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon to coffee.");
	}
}
