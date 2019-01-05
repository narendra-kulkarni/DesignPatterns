package com.mission.designPatterns.visitor.impl;

import com.mission.designPatterns.visitor.Visitor;

public class TaxCalculator implements Visitor {

	private double totalCost;
	
	@Override
	public void visit(Food food) {
		totalCost += food.getCost() - (food.getCost() * 0.2);
	}

	@Override
	public void visit(Smokes smokes) {
		totalCost += smokes.getCost() - (smokes.getCost() * 0.5);
	}

	@Override
	public void visit(Luxury luxury) {
		totalCost += luxury.getCost() - (luxury.getCost() * 0.4);
	}
	
	public double getTotalCost() {
		return totalCost;
	}
}
