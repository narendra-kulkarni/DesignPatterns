package com.mission.designPatterns.decorator;

public abstract class Condiment implements Beverage {

	protected Beverage beverage;

	public Condiment(Beverage b) {
		this.beverage = b;
	}

	public abstract String getDescription();

	public abstract int getCost();

}
