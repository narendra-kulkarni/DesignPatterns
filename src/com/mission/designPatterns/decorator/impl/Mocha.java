package com.mission.designPatterns.decorator.impl;

import com.mission.designPatterns.decorator.Beverage;
import com.mission.designPatterns.decorator.Condiment;

public class Mocha extends Condiment {

	public Mocha(Beverage b) {
		super(b);
	}

	@Override
	public String getDescription() {
		return "mocha " + beverage.getDescription();
	}

	@Override
	public int getCost() {
		return 4 + beverage.getCost();
	}

}
