package com.mission.designPatterns.decorator.impl;

import com.mission.designPatterns.decorator.Beverage;

public class Coffee implements Beverage {

	@Override
	public String getDescription() {
		return "Coffee";
	}

	@Override
	public int getCost() {
		return 10;
	}

}
