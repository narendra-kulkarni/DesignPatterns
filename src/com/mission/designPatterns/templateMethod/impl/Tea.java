package com.mission.designPatterns.templateMethod.impl;

import com.mission.designPatterns.templateMethod.Beverage;

public class Tea extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Brewing tea.");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding cardamom to tea.");
	}
}
