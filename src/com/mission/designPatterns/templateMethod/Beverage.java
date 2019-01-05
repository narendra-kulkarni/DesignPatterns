package com.mission.designPatterns.templateMethod;

public abstract class Beverage {

	public void prepareBeverage() {
		boilWater();
		brew();
		pour();
		addCondiments();
	}

	private void boilWater() {
		System.out.println("Boiling water.");
	}

	private void pour() {
		System.out.println("Pouring in the cup.");
	}

	protected abstract void brew();

	protected abstract void addCondiments();
}
