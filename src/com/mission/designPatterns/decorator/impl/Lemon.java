package com.mission.designPatterns.decorator.impl;

import com.mission.designPatterns.decorator.Beverage;
import com.mission.designPatterns.decorator.Condiment;

public class Lemon extends Condiment {

	public Lemon(Beverage b) {
		super(b);
	}

	@Override
	public String getDescription() {
		return "lemon " + beverage.getDescription();
	}

	@Override
	public int getCost() {
		return 2 + beverage.getCost();
	}

}
