package com.mission.designPatterns.decorator.impl;

import com.mission.designPatterns.decorator.Beverage;

public class Tea implements Beverage {

	@Override
	public String getDescription() {
		return "Tea";
	}

	@Override
	public int getCost() {
		return 8;
	}

}
